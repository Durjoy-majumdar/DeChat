package ot2;

import ad0.C91999u;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget$$j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import hf3.C98449c;
import hi2.C98464o;
import i40.C60247c;
import if3.C98670a;
import iu2.C60631e;
import iu2.C98802d;
import java.io.IOException;
import java.nio.charset.Charset;
import os2.C100400e0;
import p749xh.C102661q8;
import p823sg.C90193h;
import pe3.C47465a;
import te3.C101783gu2;
import te3.C101804kv2;
import te3.C101808lv2;
import te3.C101817mv2;
import te3.C64241ar2;
import vr2.C102270y;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: ot2.a */
public final class C100426a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f294202d;

    /* renamed from: e */
    public final /* synthetic */ C100433b f294203e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f294204f;

    /* renamed from: g */
    public final /* synthetic */ String f294205g;

    /* renamed from: h */
    public final /* synthetic */ String f294206h;

    /* renamed from: i */
    public final /* synthetic */ String f294207i;

    /* renamed from: j */
    public final /* synthetic */ C100436g f294208j;

    /* renamed from: ot2.a$a */
    public static final class C100427a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294209d;

        /* renamed from: e */
        public final /* synthetic */ C98670a f294210e;

        /* renamed from: f */
        public final /* synthetic */ String f294211f;

        public C100427a(C100436g gVar, C98670a aVar, String str) {
            this.f294209d = gVar;
            this.f294210e = aVar;
            this.f294211f = str;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$1");
            ((NewSightWidget$$j) this.f294209d).mo132271b(3, this.f294210e, this.f294211f);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$1");
        }
    }

    /* renamed from: ot2.a$b */
    public static final class C100428b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294212d;

        /* renamed from: e */
        public final /* synthetic */ C98670a f294213e;

        /* renamed from: f */
        public final /* synthetic */ String f294214f;

        public C100428b(C100436g gVar, C98670a aVar, String str) {
            this.f294212d = gVar;
            this.f294213e = aVar;
            this.f294214f = str;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$2");
            ((NewSightWidget$$j) this.f294212d).mo132271b(1, this.f294213e, this.f294214f);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$2");
        }
    }

    /* renamed from: ot2.a$c */
    public static final class C100429c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294215d;

        /* renamed from: e */
        public final /* synthetic */ C98670a f294216e;

        /* renamed from: f */
        public final /* synthetic */ String f294217f;

        public C100429c(C100436g gVar, C98670a aVar, String str) {
            this.f294215d = gVar;
            this.f294216e = aVar;
            this.f294217f = str;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$3");
            ((NewSightWidget$$j) this.f294215d).mo132271b(3, this.f294216e, this.f294217f);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$3");
        }
    }

    /* renamed from: ot2.a$d */
    public static final class C100430d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294218d;

        public C100430d(C100436g gVar) {
            this.f294218d = gVar;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$4");
            ((NewSightWidget$$j) this.f294218d).mo132270a(false, 0);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$4");
        }
    }

    /* renamed from: ot2.a$e */
    public static final class C100431e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294219d;

        public C100431e(C100436g gVar) {
            this.f294219d = gVar;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$5");
            ((NewSightWidget$$j) this.f294219d).mo132270a(false, 0);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$5");
        }
    }

    /* renamed from: ot2.a$f */
    public static final class C100432f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100436g f294220d;

        /* renamed from: e */
        public final /* synthetic */ int f294221e;

        public C100432f(C100436g gVar, int i) {
            this.f294220d = gVar;
            this.f294221e = i;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$6");
            ((NewSightWidget$$j) this.f294220d).mo132270a(true, this.f294221e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$6");
        }
    }

    public C100426a(String str, C100433b bVar, SnsInfo snsInfo, String str2, String str3, String str4, C100436g gVar) {
        this.f294202d = str;
        this.f294203e = bVar;
        this.f294204f = snsInfo;
        this.f294205g = str2;
        this.f294206h = str3;
        this.f294207i = str4;
        this.f294208j = gVar;
    }

    public final void run() {
        float f;
        C101817mv2 mv22;
        boolean z;
        int i;
        C39622i0 a;
        Class cls = C98449c.class;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "commitFakeVideo >> " + Thread.currentThread().getName());
        C98670a iz = ((C98449c) C86312j.m106911c(cls)).mo136679iz(this.f294202d);
        if (iz == null) {
            Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "workType is error");
            ((C119157j) C119157j.f356862d).mo183895z(new C100427a(this.f294208j, iz, this.f294202d));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        int i2 = iz.f289301a;
        if (i2 == 4007) {
            Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "result is done " + this.f294202d);
            ((C119157j) C119157j.f356862d).mo183895z(new C100428b(this.f294208j, iz, this.f294202d));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        } else if (i2 == 4008) {
            Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "result is done error");
            ((C119157j) C119157j.f356862d).mo183895z(new C100429c(this.f294208j, iz, this.f294202d));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        } else {
            C100433b bVar = this.f294203e;
            SnsInfo snsInfo = this.f294204f;
            String str = this.f294205g;
            String str2 = this.f294206h;
            String str3 = this.f294207i;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            C87412m.m108594g(snsInfo, "snsInfo");
            C87412m.m108594g(str, "videoPath");
            C87412m.m108594g(str2, "thumbPath");
            C87412m.m108594g(str3, "desc");
            C98464o.C98465a a2 = C98464o.f288797a.mo137832a(str);
            if (a2 != null) {
                Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "addSightObjectByPath commit video_info:" + a2);
                f = ((float) a2.f288800c) / 1000.0f;
            } else {
                f = 0.0f;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C94866e1.m120263iU());
            Charset charset = C119027c.f356488a;
            byte[] bytes = str.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            String sb4 = sb.toString();
            SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            C86013q1.m106461v(C86013q1.m106458s(sb4));
            SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            C86013q1.m106442c(str, sb4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C94866e1.m120263iU());
            byte[] bytes2 = str2.getBytes(charset);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            sb5.append(C90193h.m112878f(bytes2));
            String sb6 = sb5.toString();
            C86013q1.m106442c(str2, sb6);
            SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            C101804kv2 f2 = C91999u.m115560f();
            f2.f298689d = "";
            Log.m105925i("MicroMsg.BackgroundVideoFakeUploader", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", 6, sb4, "", "", "");
            f2.f298690e = 6;
            C102270y yVar = new C102270y(sb4, 6);
            yVar.f301226m = "";
            C102270y yVar2 = yVar;
            C94866e1.ay0().mo139874uP(yVar, sb4, sb6, "", "");
            if (yVar2.f301221h <= 0 || yVar2.f301220g <= 0 || yVar2.f301222i <= 0) {
                mv22 = null;
            } else {
                mv22 = new C101817mv2();
                mv22.f298876e = (float) yVar2.f301221h;
                mv22.f298875d = (float) yVar2.f301220g;
                mv22.f298877f = (float) yVar2.f301222i;
            }
            f2.f298689d = "Locall_path" + yVar2.f301219f;
            f2.f298698p = mv22;
            f2.f298701s = yVar2.f301219f;
            SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            f2.f298690e = 8;
            f2.f298691f = str3;
            if (Util.isNullOrNil(f2.f298697o)) {
                f2.f298697o = str3;
            }
            f2.f298684R = f;
            C64241ar2 ar22 = new C64241ar2();
            ar22.f182140d = f2.f298701s;
            C101808lv2 postInfo = snsInfo.getPostInfo();
            postInfo.f298747h.add(ar22);
            try {
                C47465a parseFrom = new TimeLineObject().parseFrom(snsInfo.field_content);
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
                TimeLineObject timeLineObject = (TimeLineObject) parseFrom;
                timeLineObject.ContentObj.f298427h.add(f2);
                snsInfo.setTimeLine(timeLineObject);
                snsInfo.setPostBuf(postInfo.toByteArray());
                Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "commit mediaId: " + f2.f298701s + ", " + f2.f298689d + ", " + f2.f298691f);
                SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                z = true;
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "fake error");
                SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                z = false;
            }
            if (!z) {
                ((C119157j) C119157j.f356862d).mo183895z(new C100430d(this.f294208j));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
                return;
            }
            C100400e0 Yx0 = C94866e1.Yx0();
            SnsInfo snsInfo2 = this.f294204f;
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (snsInfo2 == null) {
                i = -1;
                SnsMethodCalculate.markEndTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            } else {
                i = (int) Yx0.f294108d.mo125627q(C102661q8.TABLE_NAME, "", snsInfo2.convertTo(), false);
                Log.m105924i("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + i);
                Class cls2 = C60631e.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls2)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138177g3((long) i, StorageEventId.Companion.getINSERT());
                SnsMethodCalculate.markEndTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            }
            int size = this.f294204f.getTimeLine().ContentObj.f298427h.size();
            int createTime = this.f294204f.getCreateTime();
            Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "commit size: " + size + ", " + i + ", " + createTime);
            C94866e1.Wx0().mo60185Lo(i);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("commitFakeVideo >> localId: ");
            sb7.append(i);
            Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", sb7.toString());
            try {
                C100433b bVar2 = this.f294203e;
                SnsMethodCalculate.markStartTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                C101783gu2 gu22 = bVar2.f294222a;
                SnsMethodCalculate.markEndTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                byte[] byteArray = gu22.toByteArray();
                C87412m.m108593f(byteArray, "extInfo.toByteArray()");
                String str4 = this.f294202d;
                C95005x xVar = C95005x.f275632a;
                SnsMethodCalculate.markStartTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                String str5 = C95005x.f275633b;
                SnsMethodCalculate.markEndTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                ((C98449c) C86312j.m106911c(cls)).mo136682mD(str4, WearableStatusCodes.DUPLICATE_CAPABILITY, i, byteArray, str5, createTime);
                ((C119157j) C119157j.f356862d).mo183895z(new C100432f(this.f294208j, i));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            } catch (IOException unused2) {
                Log.m105920e("MicroMsg.BackgroundVideoFakeUploader", "parse byte error");
                ((C119157j) C119157j.f356862d).mo183895z(new C100431e(this.f294208j));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            }
        }
    }
}
