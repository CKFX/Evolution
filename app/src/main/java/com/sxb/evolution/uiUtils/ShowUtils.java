package com.sxb.evolution.uiUtils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.sxb.evolution.R;
import com.sxb.evolution.data.Animal;

/**
 * 由 sxb 创建
 * 在 2022/1/19
 */
public class ShowUtils {

    public static int     BaseSize = 1;
    public static Context context;

    public static void init(Context context) {
        ShowUtils.context = context;
    }

    public static ImageView getLayout(Animal animal) {
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams Params = new FrameLayout.LayoutParams(
                animal.getBig() * BaseSize,
                animal.getBig() * BaseSize);

        imageView.setLayoutParams(Params);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setX(animal.getX());
        imageView.setY(animal.getY());
        imageView.setImageBitmap(
                BitmapFactory.decodeResource(context.getResources(), R.mipmap.cao));
        // 透明
//        imageView.setBackgroundColor(Color.BLACK);
        return imageView;
    }
}
