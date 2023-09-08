package com.tencent.mapsdk.internal;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.d */
public final class C113614d extends C113715f {

    /* renamed from: k */
    private static final long f340001k = 1;

    public C113614d() {
        C113797h hVar = this.f340177g;
        hVar.f340452a = 2;
        hVar.f340453b = 0;
        hVar.f340454c = 0;
        hVar.f340459h = 0;
        hVar.f340458g = new byte[0];
        hVar.f340460i = new HashMap();
        this.f340177g.f340461j = new HashMap();
    }

    /* renamed from: a */
    private void m156536a(short s) {
        this.f340177g.f340452a = s;
        if (s == 3) {
            mo171985g();
        }
    }

    /* renamed from: b */
    private void m156537b(int i) {
        this.f340177g.f340459h = i;
    }

    /* renamed from: d */
    private void m156539d(byte[] bArr) {
        this.f340177g.f340458g = bArr;
    }

    /* renamed from: h */
    private short m156540h() {
        return this.f340177g.f340452a;
    }

    /* renamed from: i */
    private byte m156541i() {
        return this.f340177g.f340453b;
    }

    /* renamed from: j */
    private int m156542j() {
        return this.f340177g.f340454c;
    }

    /* renamed from: k */
    private int m156543k() {
        return this.f340177g.f340459h;
    }

    /* renamed from: l */
    private byte[] m156544l() {
        return this.f340177g.f340458g;
    }

    /* renamed from: m */
    private Map<String, String> m156545m() {
        return this.f340177g.f340460i;
    }

    /* renamed from: n */
    private Map<String, String> m156546n() {
        return this.f340177g.f340461j;
    }

    /* renamed from: o */
    private int m156547o() {
        String str = this.f340177g.f340461j.get("STATUS_RESULT_CODE");
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    /* renamed from: p */
    private String m156548p() {
        String str = this.f340177g.f340461j.get("STATUS_RESULT_DESC");
        return str != null ? str : "";
    }

    /* renamed from: b */
    private void m156538b(Map<String, String> map) {
        this.f340177g.f340461j = map;
    }

    /* renamed from: a */
    private void m156533a(byte b) {
        this.f340177g.f340453b = b;
    }

    /* renamed from: a */
    private void m156534a(int i) {
        this.f340177g.f340454c = i;
    }

    /* renamed from: a */
    private void m156535a(Map<String, String> map) {
        this.f340177g.f340460i = map;
    }
}
