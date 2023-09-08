package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.widget.GameSmallAvatarList;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import py1.C47639o0;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedSocialInfoView */
public class GameFeedSocialInfoView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public LinearLayout f113908d;

    /* renamed from: e */
    public GameSmallAvatarList f113909e;

    /* renamed from: f */
    public TextView f113910f;

    /* renamed from: g */
    public LinearLayout f113911g;

    /* renamed from: h */
    public TextView f113912h;

    public GameFeedSocialInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113908d = (LinearLayout) findViewById(C0966R.C0970id.a2_);
        this.f113909e = (GameSmallAvatarList) findViewById(C0966R.C0970id.a2b);
        this.f113910f = (TextView) findViewById(C0966R.C0970id.f357478a21);
        this.f113911g = (LinearLayout) findViewById(C0966R.C0970id.f357845c22);
        this.f113912h = (TextView) findViewById(C0966R.C0970id.c2g);
    }

    public void setData(C47639o0 o0Var) {
        if (!Util.isNullOrNil((List) o0Var.f127897e) || o0Var.f127898f != null) {
            this.f113908d.setVisibility(0);
            this.f113909e.setData(o0Var.f127897e);
            String str = o0Var.f127898f;
            if (str != null) {
                this.f113910f.setText(str);
                this.f113910f.setVisibility(0);
            } else {
                this.f113910f.setVisibility(8);
            }
        } else {
            this.f113908d.setVisibility(8);
        }
        if (o0Var.f127899g != null) {
            this.f113911g.setVisibility(0);
            this.f113912h.setText(o0Var.f127899g);
            return;
        }
        this.f113911g.setVisibility(8);
    }
}
