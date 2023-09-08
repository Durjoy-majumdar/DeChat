package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.e4 */
public class C42984e4 {

    /* renamed from: a */
    public LinearLayout f116389a;

    /* renamed from: b */
    public LinearLayout f116390b;

    /* renamed from: c */
    public LinearLayout f116391c;

    /* renamed from: d */
    public LinearLayout f116392d;

    /* renamed from: e */
    public LinearLayout f116393e;

    /* renamed from: a */
    public void mo67190a(String str) {
        if (str.equals("downloading")) {
            this.f116389a.setVisibility(0);
            this.f116390b.setVisibility(8);
            this.f116391c.setVisibility(8);
            this.f116392d.setVisibility(8);
            this.f116393e.setVisibility(8);
        } else if (str.equals("downloaded")) {
            this.f116389a.setVisibility(8);
            this.f116390b.setVisibility(0);
            this.f116391c.setVisibility(8);
            this.f116392d.setVisibility(8);
            this.f116393e.setVisibility(8);
        } else if (str.equals("undownloaded")) {
            this.f116389a.setVisibility(8);
            this.f116390b.setVisibility(8);
            this.f116391c.setVisibility(0);
            this.f116392d.setVisibility(8);
            this.f116393e.setVisibility(8);
        } else if (str.equals("using")) {
            this.f116389a.setVisibility(8);
            this.f116390b.setVisibility(8);
            this.f116391c.setVisibility(8);
            this.f116392d.setVisibility(0);
            this.f116393e.setVisibility(8);
        } else if (str.equals("canceling")) {
            this.f116389a.setVisibility(8);
            this.f116390b.setVisibility(8);
            this.f116391c.setVisibility(8);
            this.f116392d.setVisibility(8);
            this.f116393e.setVisibility(0);
        }
    }
}
