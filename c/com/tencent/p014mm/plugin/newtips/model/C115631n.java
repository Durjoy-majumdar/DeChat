package com.tencent.p014mm.plugin.newtips.model;

import java.util.List;
import p749xh.C118877o6;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.newtips.model.n */
public enum C115631n {
    MMNEWTIPS_SHOWTYPE_NONE("无红点", 10000),
    MMNEWTIPS_SHOWTYPE_REDPOINT("普通红点", 0),
    MMNEWTIPS_SHOWTYPE_NEW("New 红点", 1),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE("带 TITLE 红点", 2),
    MMNEWTIPS_SHOWTYPE_REDPOINT_ICON("带 ICON 红点", 3),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON("同时带 TITLE 和 ICON 红点", 4),
    MMNEWTIPS_SHOWTYPE_COUNTER("计数红点", 5);
    

    /* renamed from: d */
    public final String f346867d;

    /* renamed from: e */
    public final int f346868e;

    /* renamed from: f */
    public List<C115626k> f346869f;

    /* access modifiers changed from: public */
    C115631n(String str, int i) {
        this.f346869f = null;
        this.f346867d = str;
        this.f346868e = i;
    }

    /* renamed from: a */
    public static C115631n m162599a(int i) {
        C115631n nVar = MMNEWTIPS_SHOWTYPE_REDPOINT;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 10000 ? nVar : MMNEWTIPS_SHOWTYPE_NONE : MMNEWTIPS_SHOWTYPE_COUNTER : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE : MMNEWTIPS_SHOWTYPE_NEW : nVar;
    }

    /* renamed from: b */
    public static tg4 m162600b(C115631n nVar, C118877o6 o6Var) {
        tg4 tg4 = new tg4();
        int ordinal = nVar.ordinal();
        if (ordinal == 3) {
            tg4.f354436e = o6Var.field_title;
        } else if (ordinal == 4) {
            tg4.f354437f = o6Var.field_icon_url;
        } else if (ordinal == 5) {
            tg4.f354437f = o6Var.field_icon_url;
            tg4.f354436e = o6Var.field_title;
        }
        tg4.f354448t = o6Var.field_extInfo;
        return tg4;
    }

    public String toString() {
        return "NewTipsShowType{commet='" + this.f346867d + '\'' + ", value=" + this.f346868e + '}';
    }
}
