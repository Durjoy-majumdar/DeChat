package w33;

import com.tencent.p014mm.autogen.mmdata.rpt.RingTonePlaySoundReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RingtoneCallingReportStruct;
import gy3.C87412m;
import oj2.C110053a;

/* renamed from: w33.b0 */
public final class C111718b0 {

    /* renamed from: a */
    public long f334421a;

    /* renamed from: b */
    public boolean f334422b;

    /* renamed from: c */
    public String f334423c = "0";

    /* renamed from: d */
    public String f334424d = "0";

    /* renamed from: e */
    public boolean f334425e;

    /* renamed from: f */
    public boolean f334426f;

    /* renamed from: g */
    public int f334427g;

    /* renamed from: h */
    public long f334428h;

    /* renamed from: a */
    public final void mo163397a(C110053a aVar, int i, long j, boolean z, String str) {
        C110053a aVar2 = aVar;
        String str2 = str;
        C87412m.m108594g(str2, "username");
        if (this.f334421a == 0 && this.f334427g != 0 && this.f334428h != 0 && aVar2 != null) {
            this.f334421a = aVar2.f329326b;
            String str3 = aVar2.f329328d;
            C87412m.m108593f(str3, "it.mMusicSid");
            this.f334424d = str3;
            String str4 = aVar2.f329329e;
            C87412m.m108593f(str4, "it.mFinderObjectId");
            this.f334423c = str4;
            this.f334425e = aVar2.f329325a;
            this.f334426f = aVar2.f329336l;
            int i2 = this.f334427g;
            long j2 = this.f334428h;
            boolean z2 = aVar2.f329337m;
            int i3 = z ? 2 : 1;
            int i4 = !C87412m.m108589b(this.f334424d, "0") ? 1 : !C87412m.m108589b(this.f334423c, "0") ? 2 : 3;
            String str5 = i4 != 1 ? i4 != 2 ? "0" : this.f334423c : this.f334424d;
            int i5 = this.f334425e ? 2 : 1;
            long j3 = this.f334421a / ((long) 1000);
            boolean z3 = this.f334426f;
            C87412m.m108594g(str5, "feedId");
            RingTonePlaySoundReportStruct ringTonePlaySoundReportStruct = new RingTonePlaySoundReportStruct();
            boolean z4 = z2;
            ringTonePlaySoundReportStruct.f310273i = (long) i3;
            ringTonePlaySoundReportStruct.f310270f = (long) i4;
            ringTonePlaySoundReportStruct.f310268d = (long) i2;
            ringTonePlaySoundReportStruct.f310275k = j2;
            ringTonePlaySoundReportStruct.f310269e = ringTonePlaySoundReportStruct.mo86045b("feedid", str5, true);
            ringTonePlaySoundReportStruct.f310271g = (long) i5;
            ringTonePlaySoundReportStruct.f310272h = ringTonePlaySoundReportStruct.mo86045b("tousername", str2, true);
            ringTonePlaySoundReportStruct.f310274j = j3;
            ringTonePlaySoundReportStruct.f310276l = z3 ? 1 : 2;
            ringTonePlaySoundReportStruct.f310277m = z4 ? 1 : 2;
            ringTonePlaySoundReportStruct.mo86054n();
            this.f334421a = 0;
            this.f334422b = false;
            this.f334423c = "0";
            this.f334424d = "0";
            this.f334425e = false;
            this.f334427g = 0;
            this.f334428h = 0;
        }
    }

    /* renamed from: b */
    public final void mo163398b(C110053a aVar, int i, long j, boolean z, String str) {
        int i2;
        String str2;
        C110053a aVar2 = aVar;
        String str3 = str;
        C87412m.m108594g(str3, "username");
        if (this.f334421a == 0 && aVar2 != null) {
            this.f334421a = aVar2.f329326b;
            String str4 = aVar2.f329328d;
            C87412m.m108593f(str4, "it.mMusicSid");
            this.f334424d = str4;
            String str5 = aVar2.f329329e;
            C87412m.m108593f(str5, "it.mFinderObjectId");
            this.f334423c = str5;
            this.f334425e = aVar2.f329325a;
            int i3 = this.f334427g;
            long j2 = this.f334428h;
            int i4 = 2;
            int i5 = z ? 2 : 1;
            if (!C87412m.m108589b(this.f334424d, "0")) {
                i2 = 1;
            } else if (!C87412m.m108589b(this.f334423c, "0")) {
                i2 = 2;
            } else {
                return;
            }
            if (i2 == 1) {
                str2 = this.f334424d;
            } else if (i2 == 2) {
                str2 = this.f334423c;
            } else {
                return;
            }
            if (!this.f334425e) {
                i4 = 1;
            }
            boolean z2 = this.f334422b;
            long j3 = this.f334421a / ((long) 1000);
            C87412m.m108594g(str2, "feedId");
            RingtoneCallingReportStruct ringtoneCallingReportStruct = new RingtoneCallingReportStruct();
            ringtoneCallingReportStruct.f310281g = ringtoneCallingReportStruct.mo86045b("feedId", str2, true);
            int i6 = i5;
            ringtoneCallingReportStruct.f310282h = (long) i2;
            ringtoneCallingReportStruct.f310283i = (long) i4;
            ringtoneCallingReportStruct.f310285k = z2 ? 1 : 2;
            ringtoneCallingReportStruct.f310286l = j3;
            ringtoneCallingReportStruct.f310284j = ringtoneCallingReportStruct.mo86045b("toUserName", str3, true);
            ringtoneCallingReportStruct.f310279e = i3;
            ringtoneCallingReportStruct.f310280f = j2;
            ringtoneCallingReportStruct.f310278d = (long) i6;
            ringtoneCallingReportStruct.mo86054n();
            this.f334421a = 0;
            this.f334422b = false;
            this.f334423c = "0";
            this.f334424d = "0";
            this.f334425e = false;
            this.f334427g = 0;
            this.f334428h = 0;
        }
    }
}
