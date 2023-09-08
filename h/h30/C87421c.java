package h30;

import android.text.TextUtils;
import m30.C88691b;
import p749xh.C91209n5;

/* renamed from: h30.c */
public class C87421c {

    /* renamed from: a */
    public String f253317a;

    /* renamed from: b */
    public String f253318b;

    /* renamed from: c */
    public long f253319c;

    /* renamed from: d */
    public long f253320d;

    /* renamed from: e */
    public long f253321e;

    /* renamed from: f */
    public long f253322f;

    /* renamed from: g */
    public float f253323g;

    /* renamed from: h */
    public int f253324h = -1;

    /* renamed from: i */
    public long f253325i;

    /* renamed from: j */
    public long f253326j;

    /* renamed from: k */
    public long f253327k;

    /* renamed from: l */
    public String f253328l;

    /* renamed from: m */
    public String f253329m;

    /* renamed from: n */
    public int f253330n = -1;

    public C87421c(String str, String str2) {
        this.f253317a = str;
        this.f253318b = str2;
    }

    /* renamed from: a */
    public void mo121839a() {
        if (C88691b.f256042a == null) {
            C88691b.m110635a();
        }
        C91209n5 jo = C88691b.f256042a.mo123139jo(this.f253317a, this.f253318b);
        if (jo == null) {
            jo = new C91209n5();
            jo.field_type = this.f253317a;
            jo.field_id = this.f253318b;
        }
        long j = this.f253319c;
        if (j != 0) {
            jo.field_happen_time = j;
        }
        long j2 = this.f253320d;
        if (j2 != 0) {
            jo.field_predict_time = j2;
        }
        long j3 = this.f253321e;
        if (j3 != 0) {
            jo.field_extract_time = j3;
        }
        long j4 = this.f253322f;
        if (j4 != 0) {
            jo.field_recall_time = j4;
        }
        float f = this.f253323g;
        if (f != 0.0f) {
            jo.field_prediction = f;
        }
        int i = this.f253324h;
        if (i != -1) {
            jo.field_positive = i;
        }
        long j5 = this.f253325i;
        if (j5 != 0) {
            jo.field_time_on_predict = j5;
        }
        long j6 = this.f253326j;
        if (j6 != 0) {
            jo.field_time_on_extract = j6;
        }
        if (this.f253327k != 0) {
            jo.field_time_on_extract_all_feature = j6;
        }
        if (!TextUtils.isEmpty(this.f253328l)) {
            jo.field_error_on_predict = this.f253328l;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jo.field_model_heaviest_features = null;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jo.field_model_null_features = null;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jo.field_error_on_extract_all_feature = null;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jo.field_all_heaviest_features = null;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jo.field_all_null_features = null;
        }
        if (!TextUtils.isEmpty(this.f253329m)) {
            jo.field_desc = this.f253329m;
        }
        int i2 = this.f253330n;
        if (i2 != -1) {
            jo.field_predict_type = i2;
        }
        if (C88691b.f256042a == null) {
            C88691b.m110635a();
        }
        C88691b.f256042a.mo123138Lo(jo);
    }
}
