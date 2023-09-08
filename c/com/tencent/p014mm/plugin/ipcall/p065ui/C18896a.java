package com.tencent.p014mm.plugin.ipcall.p065ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.a */
public class C18896a {

    /* renamed from: a */
    public String f52989a;

    /* renamed from: b */
    public String f52990b;

    /* renamed from: c */
    public int f52991c;

    /* renamed from: d */
    public String f52992d;

    public C18896a(String str, String str2, int i, String str3) {
        this.f52989a = str;
        this.f52990b = str2;
        this.f52991c = i;
        this.f52992d = str3;
    }

    /* renamed from: a */
    public int mo23894a() {
        if (this.f52991c == 0) {
            return 0;
        }
        String[] strArr = IPCallCountryCodeScrollbar.f198432r;
        for (int i = 0; i < 26; i++) {
            if (strArr[i].equals(String.valueOf((char) this.f52991c))) {
                return this.f52991c;
            }
        }
        return "#".charAt(0);
    }
}
