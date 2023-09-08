package com.tencent.p014mm.plugin.webview.model;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.model.k1 */
public final class C6046k1 {

    /* renamed from: a */
    public final String f22333a;

    /* renamed from: b */
    public final String f22334b;

    public C6046k1(String str, String str2) {
        this.f22333a = str;
        this.f22334b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6046k1)) {
            return false;
        }
        C6046k1 k1Var = (C6046k1) obj;
        return C87412m.m108589b(this.f22333a, k1Var.f22333a) && C87412m.m108589b(this.f22334b, k1Var.f22334b);
    }

    public int hashCode() {
        String str = this.f22333a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22334b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "WebViewDownloadInfo(bizInfo=" + this.f22333a + ", sourceInfo=" + this.f22334b + ')';
    }
}
