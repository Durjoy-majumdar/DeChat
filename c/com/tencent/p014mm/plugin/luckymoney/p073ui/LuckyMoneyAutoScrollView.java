package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyAutoScrollItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.WeakHashMap;
import kg3.C76577a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView */
public class LuckyMoneyAutoScrollView extends RelativeLayout implements LuckyMoneyAutoScrollItem.C69336c {

    /* renamed from: d */
    public View f199641d;

    /* renamed from: e */
    public RelativeLayout f199642e;

    /* renamed from: f */
    public RelativeLayout f199643f;

    /* renamed from: g */
    public RelativeLayout f199644g;

    /* renamed from: h */
    public LuckyMoneyAutoScrollItem f199645h;

    /* renamed from: i */
    public LuckyMoneyAutoScrollItem f199646i;

    /* renamed from: j */
    public LuckyMoneyAutoScrollItem f199647j;

    /* renamed from: n */
    public RelativeLayout f199648n;

    /* renamed from: o */
    public RelativeLayout f199649o;

    /* renamed from: p */
    public RelativeLayout f199650p;

    /* renamed from: q */
    public ImageView f199651q;

    /* renamed from: r */
    public ImageView f199652r;

    /* renamed from: s */
    public ImageView f199653s;

    /* renamed from: t */
    public Context f199654t;

    /* renamed from: u */
    public String f199655u;

    /* renamed from: v */
    public String f199656v;

    /* renamed from: w */
    public String f199657w;

    /* renamed from: x */
    public boolean f199658x;

    /* renamed from: y */
    public C69337a f199659y;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView$a */
    public interface C69337a {
        /* renamed from: a */
        void mo95516a();
    }

    public LuckyMoneyAutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f199655u = "0";
        this.f199656v = "0";
        this.f199657w = "0";
        this.f199658x = false;
        this.f199654t = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b9a, this);
        this.f199641d = inflate;
        this.f199645h = (LuckyMoneyAutoScrollItem) inflate.findViewById(C0966R.C0970id.f5801p4);
        this.f199646i = (LuckyMoneyAutoScrollItem) inflate.findViewById(C0966R.C0970id.f5802p5);
        this.f199647j = (LuckyMoneyAutoScrollItem) inflate.findViewById(C0966R.C0970id.f5803p6);
        LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem = this.f199645h;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145191s(luckyMoneyAutoScrollItem, 2);
        C107207u.C107208b.m145191s(this.f199646i, 2);
        C107207u.C107208b.m145191s(this.f199647j, 2);
        this.f199648n = (RelativeLayout) inflate.findViewById(C0966R.C0970id.f5805p8);
        this.f199649o = (RelativeLayout) inflate.findViewById(C0966R.C0970id.f5806p9);
        this.f199650p = (RelativeLayout) inflate.findViewById(C0966R.C0970id.f5807p_);
        this.f199651q = (ImageView) inflate.findViewById(C0966R.C0970id.kie);
        this.f199652r = (ImageView) inflate.findViewById(C0966R.C0970id.kif);
        this.f199653s = (ImageView) inflate.findViewById(C0966R.C0970id.kig);
        this.f199642e = (RelativeLayout) inflate.findViewById(C0966R.C0970id.fas);
        this.f199643f = (RelativeLayout) inflate.findViewById(C0966R.C0970id.fat);
        this.f199644g = (RelativeLayout) inflate.findViewById(C0966R.C0970id.fau);
    }

    /* renamed from: a */
    public void mo95512a() {
        this.f199645h.setVisibility(8);
        this.f199646i.setVisibility(8);
        this.f199647j.setVisibility(8);
        this.f199651q.setVisibility(0);
        this.f199652r.setVisibility(0);
        this.f199653s.setVisibility(0);
    }

    /* renamed from: b */
    public void mo95513b() {
        this.f199658x = false;
        this.f199645h.setVisibility(0);
        this.f199646i.setVisibility(0);
        this.f199647j.setVisibility(0);
        this.f199651q.setVisibility(4);
        this.f199652r.setVisibility(4);
        this.f199653s.setVisibility(4);
    }

    /* renamed from: c */
    public void mo95514c(int i, int i2) {
        if (i > 0 && i2 > 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f199641d.getLayoutParams();
            layoutParams.height = i2;
            this.f199641d.setLayoutParams(layoutParams);
            this.f199641d.invalidate();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f199642e.getLayoutParams();
            layoutParams2.height = i2;
            layoutParams2.width = i;
            this.f199642e.setLayoutParams(layoutParams2);
            this.f199642e.invalidate();
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f199643f.getLayoutParams();
            layoutParams3.height = i2;
            layoutParams3.width = i;
            this.f199643f.setLayoutParams(layoutParams3);
            this.f199643f.invalidate();
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f199644g.getLayoutParams();
            layoutParams4.height = i2;
            layoutParams4.width = i;
            layoutParams4.leftMargin = C76577a.m92151b(getContext(), 3);
            this.f199644g.setLayoutParams(layoutParams4);
            this.f199644g.invalidate();
        }
    }

    public void setFinalText(String str) {
        Log.m105925i("MicroMsg.LuckyMoneyAutoScrollView", "hy: setting text: %s", str);
        this.f199655u = str.substring(0, 1);
        this.f199656v = str.substring(2, 3);
        this.f199657w = str.substring(3, 4);
        this.f199645h.setFinalNumber(Util.getInt(this.f199655u, 0));
        this.f199646i.setFinalNumber(Util.getInt(this.f199656v, 0));
        this.f199647j.setFinalNumber(Util.getInt(this.f199657w, 0));
        this.f199651q.setImageResource(LuckyMoneyAutoScrollItem.f199629j.get(Util.getInt(this.f199655u, 0)).intValue());
        this.f199652r.setImageResource(LuckyMoneyAutoScrollItem.f199629j.get(Util.getInt(this.f199656v, 0)).intValue());
        this.f199653s.setImageResource(LuckyMoneyAutoScrollItem.f199629j.get(Util.getInt(this.f199657w, 0)).intValue());
        this.f199651q.setVisibility(4);
        this.f199652r.setVisibility(4);
        this.f199653s.setVisibility(4);
        this.f199645h.setOnScrollEndListener(this);
        this.f199646i.setOnScrollEndListener(this);
        this.f199647j.setOnScrollEndListener(this);
        Log.m105925i("MicroMsg.LuckyMoneyAutoScrollView", "hy: first: %s, second :%s, third: %s", this.f199655u, this.f199656v, this.f199657w);
    }

    public LuckyMoneyAutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
