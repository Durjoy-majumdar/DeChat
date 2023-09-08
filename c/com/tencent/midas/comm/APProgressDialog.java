package com.tencent.midas.comm;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pay.tool.APMidasCommMethod;

public class APProgressDialog extends ProgressDialog {
    private Context context;
    private String loadingTxt = "请稍候...";
    private TextView loading_txt = null;

    public APProgressDialog(Context context2) {
        super(context2);
        this.context = context2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(APMidasCommMethod.getLayoutId(this.context, "unipay_layout_loadding"));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.2f);
        alphaAnimation.setDuration(600);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        ((ProgressBar) findViewById(APMidasCommMethod.getId(this.context, "unipay_progress"))).setAnimation(alphaAnimation);
        alphaAnimation.start();
        TextView textView = (TextView) findViewById(APMidasCommMethod.getId(this.context, "unipay_id_LoadingTxt"));
        this.loading_txt = textView;
        textView.setText(this.loadingTxt);
        setCancelable(false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        cancel();
        return false;
    }

    public void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        this.loadingTxt = String.valueOf(charSequence);
    }
}
