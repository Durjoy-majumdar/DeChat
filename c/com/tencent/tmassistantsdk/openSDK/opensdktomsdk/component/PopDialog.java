package com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton;
import com.tencent.tmassistantsdk.util.Res;
import com.tencent.tmassistantsdk.util.TMLog;
import com.tencent.xweb.file.XVFSFile;
import qo3.C77390c0;

public class PopDialog extends C77390c0 {
    public static final int DIALOG_STYLE_MUL_BTN = 2;
    public static final int DIALOG_STYLE_SINGLE_BTN = 1;
    public static final String TAG = "PopDialog";
    public RelativeLayout contentLayout;
    public TextView contentView;
    public ProgressBar downloadProgressBar;
    public TextView downloadText;
    public Context mContext;
    private Button negativeBtn;
    public Button positiveBtn;
    public FrameLayout positiveLayout;
    public Res rTool;
    public int style;
    public TextView titleView;

    public PopDialog(Context context) {
        super(context);
        this.style = 0;
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
    }

    private void initHeaderView() {
        this.titleView.setPadding(m164110px(30), 0, m164110px(30), 0);
        this.contentLayout.setPadding(m164110px(30), 0, m164110px(30), m164110px(30));
        this.contentView.setPadding(0, m164110px(30), 0, m164110px(30));
    }

    private void initMulDialog() {
        this.negativeBtn.setHeight(m164110px(78));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.negativeBtn.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, m164110px(30), 0);
        this.negativeBtn.setLayoutParams(marginLayoutParams);
        this.positiveBtn.setHeight(m164110px(78));
        this.positiveBtn.setTextSize((float) m164110px(30));
        this.downloadProgressBar.setMinimumHeight(m164110px(78));
        this.downloadText.setHeight(m164110px(78));
    }

    private void initSingleDialog() {
        this.positiveLayout.setVisibility(8);
        this.negativeBtn.setHeight(m164110px(78));
        this.negativeBtn.setText(this.mContext.getString(this.rTool.string("white_list_submit")));
    }

    /* renamed from: px */
    private int m164110px(int i) {
        int screenHeight = getScreenHeight();
        int screenWidth = getScreenWidth();
        TMLog.m164114i(TAG, " width = " + screenWidth + "  height = " + screenHeight);
        if (screenHeight <= screenWidth) {
            screenHeight = screenWidth;
        }
        int i2 = (int) ((((float) i) * (((float) screenHeight) + 0.0f)) / 1280.0f);
        TMLog.m164114i(TAG, "rtn" + i + XVFSFile.PATH_SEPARATOR + i2);
        return i2;
    }

    private void relayoutView() {
        initHeaderView();
        int i = this.style;
        if (i == 1) {
            initSingleDialog();
        } else if (i == 2) {
            initMulDialog();
        }
    }

    public int getScreenHeight() {
        Context context = this.mContext;
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public int getScreenWidth() {
        Context context = this.mContext;
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Res res = new Res(this.mContext);
        this.rTool = res;
        super.setContentView(res.layout("com_tencent_tmassistant_sdk_white_list_dlg"));
        super.getWindow().setLayout(m164110px(662), m164110px(662));
        setCancelable(false);
        this.titleView = (TextView) findViewById(this.rTool.mo179883id("dlg_title_tv"));
        this.contentLayout = (RelativeLayout) findViewById(this.rTool.mo179883id("content"));
        this.contentView = (TextView) findViewById(this.rTool.mo179883id("dlg_body_tv"));
        this.positiveBtn = (Button) findViewById(this.rTool.mo179883id("positive_btn"));
        this.positiveLayout = (FrameLayout) findViewById(this.rTool.mo179883id("positive_btn_frame_layout"));
        this.downloadProgressBar = (ProgressBar) findViewById(this.rTool.mo179883id("download_pb"));
        this.downloadText = (TextView) findViewById(this.rTool.mo179883id("progress_txt_tv"));
        this.negativeBtn = (Button) findViewById(this.rTool.mo179883id("negtive_btn"));
        relayoutView();
    }

    public void setContent(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.contentView.setText(str);
        }
    }

    public void setNegativeBtnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.negativeBtn.setOnClickListener(onClickListener);
        }
    }

    public void setNegativeBtnText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.negativeBtn.setText(str);
        }
    }

    public void setPositiveBtnBgResource(int i) {
        if (i != 0) {
            this.positiveBtn.setBackgroundResource(i);
        }
    }

    public void setPositiveBtnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.positiveBtn.setOnClickListener(onClickListener);
        }
    }

    public void setPositiveBtnEnable(boolean z) {
        Button button = this.positiveBtn;
        if (button != null) {
            button.setEnabled(z);
        }
    }

    public void setPositiveBtnTag(ActionButton actionButton) {
        if (actionButton != null) {
            this.positiveBtn.setTag(actionButton);
        }
    }

    public void setPositiveBtnText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.downloadText.setText(str);
        }
    }

    public void setTitle(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.titleView.setText(str);
        }
    }

    public PopDialog(Context context, int i) {
        super(context, i);
        this.style = 0;
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
    }

    public PopDialog(Context context, int i, int i2) {
        super(context, i);
        this.titleView = null;
        this.contentLayout = null;
        this.contentView = null;
        this.positiveBtn = null;
        this.positiveLayout = null;
        this.downloadProgressBar = null;
        this.downloadText = null;
        this.rTool = null;
        this.negativeBtn = null;
        this.mContext = context;
        this.style = i2;
    }
}
