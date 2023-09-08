package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton */
public class IPCallFuncButton extends LinearLayout {

    /* renamed from: d */
    public ImageView f313311d;

    /* renamed from: e */
    public TextView f313312e;

    /* renamed from: f */
    public Drawable f313313f;

    /* renamed from: g */
    public Drawable f313314g;

    /* renamed from: h */
    public Drawable f313315h;

    /* renamed from: i */
    public String f313316i;

    /* renamed from: j */
    public boolean f313317j;

    /* renamed from: n */
    public boolean f313318n = false;

    /* renamed from: o */
    public boolean f313319o = true;

    /* renamed from: p */
    public C105390b f313320p;

    /* renamed from: q */
    public View.OnTouchListener f313321q = new C105389a();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton$a */
    public class C105389a implements View.OnTouchListener {
        public C105389a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!IPCallFuncButton.this.f313319o) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            if (motionEvent.getAction() == 0) {
                IPCallFuncButton iPCallFuncButton = IPCallFuncButton.this;
                if (!iPCallFuncButton.f313317j) {
                    Drawable drawable = iPCallFuncButton.f313314g;
                    if (drawable != null) {
                        iPCallFuncButton.f313311d.setImageDrawable(drawable);
                    }
                } else {
                    if (iPCallFuncButton.f313318n) {
                        iPCallFuncButton.f313311d.setImageDrawable(iPCallFuncButton.f313313f);
                        IPCallFuncButton.this.f313318n = false;
                    } else {
                        iPCallFuncButton.f313311d.setImageDrawable(iPCallFuncButton.f313314g);
                        IPCallFuncButton.this.f313318n = true;
                    }
                    IPCallFuncButton iPCallFuncButton2 = IPCallFuncButton.this;
                    C105390b bVar = iPCallFuncButton2.f313320p;
                    if (bVar != null) {
                        bVar.mo150121a(iPCallFuncButton2.f313318n);
                    }
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                IPCallFuncButton iPCallFuncButton3 = IPCallFuncButton.this;
                if (!iPCallFuncButton3.f313317j) {
                    Drawable drawable2 = iPCallFuncButton3.f313313f;
                    if (drawable2 != null) {
                        iPCallFuncButton3.f313311d.setImageDrawable(drawable2);
                    }
                    C105390b bVar2 = IPCallFuncButton.this.f313320p;
                    if (bVar2 != null) {
                        bVar2.mo150121a(false);
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton$b */
    public interface C105390b {
        /* renamed from: a */
        void mo150121a(boolean z);
    }

    public IPCallFuncButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b2a, this);
        this.f313311d = (ImageView) findViewById(C0966R.C0970id.anq);
        this.f313312e = (TextView) findViewById(C0966R.C0970id.khj);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C0966R.C0967a.f2314c, 0, 0);
        this.f313313f = obtainStyledAttributes.getDrawable(2);
        this.f313314g = obtainStyledAttributes.getDrawable(3);
        this.f313317j = obtainStyledAttributes.getBoolean(0, false);
        this.f313315h = obtainStyledAttributes.getDrawable(1);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f313316i = getContext().getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (!Util.isNullOrNil(this.f313316i)) {
            this.f313312e.setText(this.f313316i);
        } else {
            this.f313312e.setVisibility(8);
        }
        Drawable drawable = this.f313313f;
        if (drawable != null) {
            this.f313311d.setImageDrawable(drawable);
        }
        this.f313311d.setClickable(true);
        this.f313311d.setOnTouchListener(this.f313321q);
    }

    /* renamed from: a */
    public boolean mo150113a() {
        if (this.f313317j) {
            return this.f313318n;
        }
        return false;
    }

    public String getFuncText() {
        return this.f313316i;
    }

    public void setCheckBoxMode(boolean z) {
        if (this.f313317j != z) {
            this.f313317j = z;
            this.f313318n = false;
            Drawable drawable = this.f313313f;
            if (drawable != null) {
                this.f313311d.setImageDrawable(drawable);
            }
        }
    }

    public void setChecked(boolean z) {
        if (z != this.f313318n && this.f313317j) {
            this.f313318n = z;
            if (z) {
                this.f313311d.setImageDrawable(this.f313314g);
            } else {
                this.f313311d.setImageDrawable(this.f313313f);
            }
        }
    }

    public void setClickCallback(C105390b bVar) {
        this.f313320p = bVar;
    }

    public void setEnable(boolean z) {
        Drawable drawable;
        if (z != this.f313319o) {
            this.f313319o = z;
            if (z || (drawable = this.f313315h) == null) {
                this.f313311d.setImageDrawable(this.f313313f);
            } else {
                this.f313311d.setImageDrawable(drawable);
            }
            this.f313318n = false;
        }
    }

    public void setFuncText(String str) {
        this.f313316i = str;
        this.f313312e.setText(str);
    }
}
