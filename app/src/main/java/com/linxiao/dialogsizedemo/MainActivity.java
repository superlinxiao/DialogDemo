package com.linxiao.dialogsizedemo;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/**
 * 问题：alterDialog在屏幕中的宽度是怎么决定的？
 *
 * 经过查看代码，没有确定具体是哪里影响了dialog的宽度。有可能是通过theme的资源文件，有可能是
 * WindowManager中动态设置等等。
 *
 * 如果以后在项目中需要根据dialog的宽度编码相关需求，那么就通过window.setLayout（width,height）来
 * 进行动态设置。这里的宽高可以根据由屏幕宽高的比例来决定。
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
//        commonAlterDialog();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.create();
        Window window = dialog.getWindow();
        //先show之后，再setContentView，不然可能会被show里面view覆盖，导致展示不出来
        dialog.show();
        if (window != null) {
            window.setContentView(R.layout.dialog_test);
            window.setLayout((int) (DeviceUtil.getScreenWidth(this) *0.8), WindowManager.LayoutParams.WRAP_CONTENT);
        }
    }

    private void commonAlterDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.setTitle("提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示提示")
                .setMessage("这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题")
                .setNegativeButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        dialog.show();
    }
}
