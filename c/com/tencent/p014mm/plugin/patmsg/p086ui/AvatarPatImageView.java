package com.tencent.p014mm.plugin.patmsg.p086ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p745wv.C38296b;
import vd2.C78386e;
import yd2.C38994a;
import yd2.C79069b;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView */
public class AvatarPatImageView extends AppCompatImageView implements C78386e {

    /* renamed from: f */
    public C78386e.C78387a f202255f;

    /* renamed from: g */
    public View.OnClickListener f202256g;

    /* renamed from: h */
    public C38994a f202257h;

    public AvatarPatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C78386e.C78387a getDoubleClickListener() {
        return this.f202255f;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f202256g;
    }

    public int getTagScene() {
        if (getTag(C0966R.C0970id.hrm) == null) {
            return 0;
        }
        return ((Integer) getTag(C0966R.C0970id.hrm)).intValue();
    }

    public String getTagTalker() {
        return getTag(C0966R.C0970id.hrn) == null ? "" : (String) getTag(C0966R.C0970id.hrn);
    }

    public String getTagUsername() {
        return (String) getTag(C0966R.C0970id.hro);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((C79069b) this.f202257h).mo109012a();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f202256g = onClickListener;
        super.setOnClickListener(((C79069b) this.f202257h).f232198d);
    }

    public void setOnDoubleClickListener(C78386e.C78387a aVar) {
        this.f202255f = aVar;
    }

    public void setTagScene(int i) {
        setTag(C0966R.C0970id.hrm, Integer.valueOf(i));
    }

    public void setTagTalker(String str) {
        setTag(C0966R.C0970id.hrn, str);
    }

    public void setTagUsername(String str) {
        if (!Util.nullAsNil(getTagUsername()).equals(str)) {
            ((C79069b) this.f202257h).mo109012a();
        }
        setTag(C0966R.C0970id.hro, str);
    }

    public AvatarPatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C38994a ei02 = ((C38296b) C86312j.m106911c(C38296b.class)).ei0();
        this.f202257h = ei02;
        C79069b bVar = (C79069b) ei02;
        bVar.getClass();
        bVar.f232195a = this;
    }
}
