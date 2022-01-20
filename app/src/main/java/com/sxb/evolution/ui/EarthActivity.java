package com.sxb.evolution.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.sxb.evolution.R;
import com.sxb.evolution.data.Animal;
import com.sxb.evolution.data.Earth;
import com.sxb.evolution.gene.GeneUtils;
import com.sxb.evolution.uiUtils.ShowUtils;

import java.util.ArrayList;
import java.util.List;

public class EarthActivity extends AppCompatActivity {

    FrameLayout earthView;

    public Earth earthData;

    public int windowX = 0;
    public int windowY = 0;

    // 测试数据
    public static final List<String[]> TestGene = new ArrayList<String[]>() {{
        add(new String[]{"体型1", "100", "", ""}); // 除了防御所有 参数乘以此参数
        add(new String[]{"速度2", "2", "", ""});  // 增加能耗，减少防御，只能追上移速慢的生物
        add(new String[]{"光合3", "1", "", ""}); // 增加环境氧气，消耗环境CO2，增加能量
        add(new String[]{"消化4", "0", "", ""}); // 增加能耗   消化能力强能吃的防御力越高
        add(new String[]{"攻击5", "被动攻击", "1", ""}); // 只能伤害防御力比攻击力低的生物
        add(new String[]{"防御6", "1", "", ""}); // 拖慢移速   增加消化难度
        add(new String[]{"代谢7", "1", "", ""}); // 增加氧气消耗
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();

        earthView.post(()->{
            initUiData();
            initTestUI();
        });
    }


    private void initData() {
        ShowUtils.init(this);
        earthData = new Earth();
    }

    // 初始化UI 数据
    private void initUiData() {
        windowX = earthView.getWidth();
        windowY = earthView.getHeight();
    }

    private void initView() {
        earthView = findViewById(R.id.earth);
    }

    // 初始化测试的生物
    private void initTestUI() {
        // 基因转生物demo
        for (int i = 0; i < 50; i++) {
            Animal animal = GeneUtils.attGetFromGene(new Animal(), TestGene);
            animal.setX((int) (windowX*Math.random()));
            animal.setY((int) (windowY*Math.random()));
            animal.setBig((int) (100*Math.random()+10));
            earthData.getAnimals().add(animal);
        }

        for (int i = 0; i < earthData.getAnimals().size(); i++) {
            earthView.addView(ShowUtils.getLayout(earthData.getAnimals().get(i)));
        }
    }
}