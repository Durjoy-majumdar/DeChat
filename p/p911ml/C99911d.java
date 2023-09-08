package p911ml;

import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import p490dl.C97489o;
import p490dl.C97493q;
import p490dl.C97496s;
import p833zk.C103045g;
import p833zk.C103047h;
import u60.C65220d;
import u60.C65234n;
import z51.C39315g;

/* renamed from: ml.d */
public final class C99911d extends C65220d {

    /* renamed from: f */
    public final EmojiInfo f292762f;

    /* renamed from: g */
    public final String f292763g = "MicroMsg.EmojiCaptureUploadTask";

    /* renamed from: h */
    public final long f292764h;

    /* renamed from: i */
    public long f292765i;

    /* renamed from: j */
    public final boolean f292766j;

    /* renamed from: ml.d$a */
    public static final class C99912a implements C97493q.C97494a {

        /* renamed from: a */
        public final /* synthetic */ C99911d f292767a;

        /* renamed from: b */
        public final /* synthetic */ long f292768b;

        public C99912a(C99911d dVar, long j) {
            this.f292767a = dVar;
            this.f292768b = j;
        }

        /* renamed from: a */
        public void mo136778a(int i, String str, String str2) {
            int i2 = i;
            String str3 = str;
            String str4 = this.f292767a.f292763g;
            Log.m105924i(str4, "uploadCallback: " + i2 + ", " + str3);
            this.f292767a.f292765i = Util.milliSecondsToNow(this.f292768b);
            if (i2 == 0) {
                C99911d dVar = this.f292767a;
                int i3 = dVar.f292762f.field_captureScene;
                EmojiCaptureReporter.m117776b(20, dVar.f292764h, 0, 0, 0, 0, dVar.f292765i, 0, 0, i3);
                C115669n nVar = C115669n.INSTANCE;
                EmojiInfo emojiInfo = dVar.f292762f;
                nVar.mo160131h(10431, 7, dVar.f292762f.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 0, 0, Integer.valueOf(dVar.f292762f.field_size), C75592q0.m90789s(), dVar.f292762f.field_activityid);
                if (!dVar.f292766j || C97496s.m125614b()) {
                    dVar.mo11853b(C65234n.OK);
                    C76778b.f224582a.mo107030a(dVar.f292764h, true, str3);
                    return;
                }
                Log.m105928w(dVar.f292763g, "upload wxam but not decode, load gif");
                EmojiInfo emojiInfo2 = dVar.f292762f;
                C99913e eVar = new C99913e(dVar, str3);
                C87412m.m108594g(emojiInfo2, "emojiInfo");
                new C103045g(emojiInfo2, new C103047h(emojiInfo2, eVar));
                return;
            }
            C99911d dVar2 = this.f292767a;
            EmojiInfo emojiInfo3 = dVar2.f292762f;
            emojiInfo3.getClass();
            emojiInfo3.field_captureStatus = 4;
            int i4 = dVar2.f292762f.field_captureScene;
            switch (i2) {
                case 2:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 2, i4);
                    EmojiInfo emojiInfo4 = dVar2.f292762f;
                    emojiInfo4.getClass();
                    emojiInfo4.field_captureUploadErrCode = 8;
                    break;
                case 3:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 1, i4);
                    EmojiInfo emojiInfo5 = dVar2.f292762f;
                    emojiInfo5.getClass();
                    emojiInfo5.field_captureUploadErrCode = 5;
                    break;
                case 4:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 5, i4);
                    EmojiInfo emojiInfo6 = dVar2.f292762f;
                    emojiInfo6.getClass();
                    emojiInfo6.field_captureUploadErrCode = 4;
                    break;
                case 5:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 7, i4);
                    EmojiInfo emojiInfo7 = dVar2.f292762f;
                    emojiInfo7.getClass();
                    emojiInfo7.field_captureUploadErrCode = 1;
                    break;
                case 6:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 8, i4);
                    EmojiInfo emojiInfo8 = dVar2.f292762f;
                    emojiInfo8.getClass();
                    emojiInfo8.field_captureUploadErrCode = 2;
                    break;
                case 7:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 9, i4);
                    EmojiInfo emojiInfo9 = dVar2.f292762f;
                    emojiInfo9.getClass();
                    emojiInfo9.field_captureUploadErrCode = 3;
                    break;
                case 8:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 6, i4);
                    EmojiInfo emojiInfo10 = dVar2.f292762f;
                    emojiInfo10.getClass();
                    emojiInfo10.field_captureUploadErrCode = 9;
                    break;
                case 9:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 10, i4);
                    EmojiInfo emojiInfo11 = dVar2.f292762f;
                    emojiInfo11.getClass();
                    emojiInfo11.field_captureUploadErrCode = 10;
                    break;
                case 10:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 4, i4);
                    EmojiInfo emojiInfo12 = dVar2.f292762f;
                    emojiInfo12.getClass();
                    emojiInfo12.field_captureUploadErrCode = 7;
                    break;
                case 11:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 3, i4);
                    EmojiInfo emojiInfo13 = dVar2.f292762f;
                    emojiInfo13.getClass();
                    emojiInfo13.field_captureUploadErrCode = 10;
                    break;
                default:
                    EmojiCaptureReporter.m117779f(dVar2.f292764h, 3, i4);
                    EmojiInfo emojiInfo14 = dVar2.f292762f;
                    emojiInfo14.getClass();
                    emojiInfo14.field_captureUploadErrCode = 6;
                    break;
            }
            C97489o.m125592g().mo136770l(true);
            ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d().r50(dVar2.f292762f);
            C76778b.f224582a.mo107030a(dVar2.f292764h, false, (String) null);
            dVar2.mo11853b(C65234n.Fail);
        }
    }

    public C99911d(EmojiInfo emojiInfo) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f292762f = emojiInfo;
        this.f292764h = emojiInfo.field_captureEnterTime;
        this.f292766j = !Util.isNullOrNil(emojiInfo.field_wxamMd5);
    }

    /* renamed from: a */
    public void mo11852a() {
        new C97493q(this.f292762f, new C99912a(this, Util.nowMilliSecond()));
    }

    /* renamed from: d */
    public String mo11854d() {
        return String.valueOf(this.f292764h);
    }
}
