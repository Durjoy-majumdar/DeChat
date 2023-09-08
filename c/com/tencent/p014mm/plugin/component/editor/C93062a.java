package com.tencent.p014mm.plugin.component.editor;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import o21.C100273b;
import pb1.C100734q;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.component.editor.a */
public class C93062a {

    /* renamed from: a */
    public C101834rc0 f268081a;

    /* renamed from: b */
    public String f268082b;

    /* renamed from: c */
    public int f268083c;

    /* renamed from: d */
    public String f268084d;

    /* renamed from: e */
    public String f268085e;

    /* renamed from: f */
    public long f268086f;

    /* renamed from: g */
    public long f268087g;

    /* renamed from: h */
    public String f268088h;

    /* renamed from: i */
    public String f268089i;

    /* renamed from: j */
    public boolean f268090j;

    /* renamed from: k */
    public C93063a f268091k;

    /* renamed from: l */
    public int f268092l;

    /* renamed from: com.tencent.mm.plugin.component.editor.a$a */
    public enum C93063a {
        TYPE_THUMB,
        TYPE_FILE
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.a$b */
    public enum C93064b {
        TRAN,
        SUCC,
        ERR,
        OUT_OF_DATE
    }

    public C93062a(C101834rc0 rc02, boolean z, C93063a aVar, int i) {
        this.f268081a = rc02;
        this.f268090j = z;
        this.f268091k = aVar;
        if (aVar == C93063a.TYPE_FILE) {
            this.f268082b = rc02.f299280T;
            this.f268086f = rc02.f299276R;
            this.f268089i = rc02.f299329u;
            this.f268088h = rc02.f299325s;
            this.f268084d = C100273b.m131075c(rc02);
            int i2 = rc02.f299258I;
            if (i2 == 3) {
                this.f268083c = C100734q.m131819J(rc02.f299262K);
            } else {
                this.f268083c = i2;
            }
        } else {
            String str = rc02.f299280T;
            this.f268082b = str + "_t";
            this.f268089i = rc02.f299309j;
            this.f268088h = rc02.f299305h;
            this.f268086f = rc02.f299336x0;
            this.f268084d = C100273b.m131077e(rc02);
        }
        this.f268085e = this.f268084d + ".temp";
        if (!z && (Util.isNullOrNil(this.f268089i) || Util.isNullOrNil(this.f268088h))) {
            Log.m105920e("Editor.CdnInfo", "getCdnDataInfo, type recv, cdnDataUrl must not be null!");
        }
        if (z && Util.isNullOrNil(this.f268084d)) {
            Log.m105920e("Editor.CdnInfo", "getCdnDataInfo, type send, path must not be null!");
        }
        this.f268092l = i;
    }

    public String toString() {
        return "CdnInfo{dataId='" + this.f268082b + '\'' + ", dataType=" + this.f268083c + ", path='" + this.f268084d + '\'' + ", tempPath='" + this.f268085e + '\'' + ", totalLen=" + this.f268086f + ", cdnUrl='" + this.f268088h + '\'' + ", cdnKey='" + this.f268089i + '\'' + ", isSend=" + this.f268090j + ", mediaType=" + this.f268091k + '}';
    }
}
