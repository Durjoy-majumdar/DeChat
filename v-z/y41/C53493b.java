package y41;

import p749xh.C53352w2;

/* renamed from: y41.b */
public class C53493b {

    /* renamed from: a */
    public String f150415a;

    /* renamed from: b */
    public int f150416b;

    /* renamed from: c */
    public long f150417c;

    /* renamed from: d */
    public long f150418d;

    /* renamed from: e */
    public long f150419e;

    /* renamed from: f */
    public String f150420f;

    /* renamed from: g */
    public int f150421g;

    /* renamed from: h */
    public int f150422h;

    /* renamed from: i */
    public String f150423i;

    /* renamed from: j */
    public long f150424j;

    /* renamed from: k */
    public int f150425k;

    /* renamed from: l */
    public long f150426l;

    /* renamed from: m */
    public String f150427m;

    /* renamed from: n */
    public int f150428n;

    /* renamed from: o */
    public int f150429o;

    /* renamed from: p */
    public int f150430p;

    /* renamed from: q */
    public int f150431q;

    /* renamed from: r */
    public int f150432r;

    /* renamed from: s */
    public int f150433s;

    public C53493b() {
        this.f150433s = 1;
    }

    /* renamed from: a */
    public void mo74165a(C53352w2 w2Var) {
        this.f150415a = w2Var.field_appId;
        this.f150416b = w2Var.field_scene;
        long j = w2Var.field_startSize;
        this.f150417c = j;
        long j2 = w2Var.field_downloadedSize - j;
        this.f150418d = j2;
        if (j2 < 0) {
            j2 = 0;
        }
        this.f150418d = j2;
        this.f150419e = w2Var.field_totalSize;
        this.f150420f = w2Var.field_downloadUrl;
        this.f150421g = w2Var.field_errCode;
        this.f150422h = w2Var.field_downloaderType;
        this.f150423i = w2Var.field_channelId;
        long j3 = w2Var.field_finishTime;
        if (j3 <= 0) {
            j3 = System.currentTimeMillis();
        }
        long j4 = w2Var.field_startTime;
        if (j4 == 0) {
            this.f150424j = 0;
        } else {
            this.f150424j = (j3 - j4) / 1000;
        }
        if (this.f150424j < 0) {
            this.f150424j = 0;
        }
        this.f150425k = w2Var.field_startState;
        this.f150426l = w2Var.field_downloadId;
        this.f150427m = w2Var.field_extInfo;
        this.f150428n = w2Var.field_reserveInWifi ? 1 : 0;
        this.f150429o = w2Var.field_startScene;
        this.f150430p = w2Var.field_uiarea;
        this.f150431q = w2Var.field_noticeId;
        this.f150432r = w2Var.field_ssid;
        this.f150433s = w2Var.field_downloadType;
    }

    public C53493b(String str, int i, long j, String str2, String str3, int i2) {
        this.f150433s = 1;
        this.f150415a = str;
        this.f150416b = i;
        this.f150426l = j;
        this.f150423i = str2;
        this.f150427m = str3;
        this.f150428n = i2;
    }

    public C53493b(String str, long j, String str2, long j2, int i) {
        this.f150433s = 1;
        this.f150415a = str;
        this.f150426l = j;
        this.f150423i = str2;
        this.f150424j = j2;
        this.f150428n = i;
    }

    public C53493b(String str, int i, String str2, int i2, int i3, int i4, int i5) {
        this.f150415a = str;
        this.f150416b = i;
        this.f150429o = i;
        this.f150427m = str2;
        this.f150428n = this.f150428n;
        this.f150430p = i2;
        this.f150431q = i4;
        this.f150432r = i3;
        this.f150433s = i5;
    }
}
