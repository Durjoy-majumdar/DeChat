package vr2;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C96983o3;
import te3.C101804kv2;

/* renamed from: vr2.w */
public class C102269w {

    /* renamed from: a */
    public C101804kv2 f301203a;

    /* renamed from: b */
    public int f301204b;

    /* renamed from: c */
    public String f301205c;

    /* renamed from: d */
    public String f301206d;

    /* renamed from: e */
    public String f301207e;

    /* renamed from: f */
    public C96983o3 f301208f;

    /* renamed from: g */
    public String f301209g;

    /* renamed from: h */
    public String f301210h;

    /* renamed from: i */
    public String f301211i;

    /* renamed from: j */
    public SparseArray<C101804kv2> f301212j;

    /* renamed from: k */
    public int f301213k;

    public C102269w() {
        this.f301212j = new SparseArray<>();
    }

    /* renamed from: a */
    public String mo141834a() {
        SnsMethodCalculate.markStartTimeMs("getAesKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        String str = this.f301209g;
        SnsMethodCalculate.markEndTimeMs("getAesKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        return str;
    }

    /* renamed from: b */
    public String mo141835b() {
        SnsMethodCalculate.markStartTimeMs("getAuthKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        String str = this.f301210h;
        SnsMethodCalculate.markEndTimeMs("getAuthKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        return str;
    }

    /* renamed from: c */
    public C101804kv2 mo141836c() {
        SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        C101804kv2 kv22 = this.f301203a;
        SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        return kv22;
    }

    /* renamed from: d */
    public int mo141837d() {
        SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        int i = this.f301213k;
        SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
        return i;
    }

    public C102269w(String str, SparseArray<C101804kv2> sparseArray, int i, String str2, C96983o3 o3Var, int i2) {
        this.f301211i = str;
        this.f301212j = sparseArray;
        this.f301204b = i;
        this.f301205c = str2;
        this.f301208f = o3Var;
        this.f301213k = i2;
    }

    public C102269w(C101804kv2 kv22, int i, String str, C96983o3 o3Var, String str2, String str3, String str4, String str5) {
        this.f301203a = kv22;
        this.f301204b = i;
        this.f301208f = o3Var;
        this.f301205c = str;
        this.f301206d = str2;
        this.f301207e = str3;
        this.f301209g = str4;
        this.f301210h = str5;
    }
}
