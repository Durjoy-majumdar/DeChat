package jp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import kp2.C99158b;

/* renamed from: jp2.p */
public class C98973p {

    /* renamed from: a */
    public String f290176a = "MicroMsg.SnsAdVideoStatistic";

    /* renamed from: b */
    public int f290177b = 0;

    /* renamed from: c */
    public int f290178c = 0;

    /* renamed from: d */
    public long f290179d = 0;

    /* renamed from: e */
    public long f290180e = 0;

    /* renamed from: f */
    public int f290181f = 0;

    /* renamed from: g */
    public int f290182g = 0;

    /* renamed from: h */
    public int f290183h = 0;

    /* renamed from: i */
    public boolean f290184i = false;

    /* renamed from: j */
    public C99158b f290185j = new C99158b();

    /* renamed from: k */
    public LinkedList<C99158b> f290186k = new LinkedList<>();

    /* renamed from: l */
    public long f290187l = 0;

    /* renamed from: m */
    public long f290188m = 0;

    /* renamed from: n */
    public long f290189n = 0;

    /* renamed from: o */
    public long f290190o;

    public C98973p() {
    }

    /* renamed from: a */
    public synchronized void mo138328a() {
        SnsMethodCalculate.markStartTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j = this.f290189n;
        if (j == 0) {
            SnsMethodCalculate.markEndTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        long ticksToNow = Util.ticksToNow(j);
        this.f290189n = 0;
        C99158b bVar = this.f290185j;
        if (bVar != null) {
            bVar.f290746h += ticksToNow;
            Log.m105924i(this.f290176a, "calcPauseTime, thisPauseTime=" + ticksToNow + ", total=" + this.f290185j.f290746h);
        }
        SnsMethodCalculate.markEndTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    /* renamed from: b */
    public void mo138329b() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        this.f290188m = Util.currentTicks();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    /* renamed from: c */
    public void mo138330c() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j = this.f290188m;
        if (j == 0) {
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        this.f290180e += Util.ticksToNow(j);
        this.f290188m = 0;
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    /* renamed from: d */
    public synchronized String mo138331d() {
        String stringBuffer;
        SnsMethodCalculate.markStartTimeMs("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j = this.f290179d;
        this.f290178c = j == 0 ? 0 : (int) Util.ticksToNow(j);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("<viewinfo>");
        stringBuffer2.append("<downloadstatus>");
        stringBuffer2.append(this.f290177b);
        stringBuffer2.append("</downloadstatus>");
        stringBuffer2.append("<staytotaltime>");
        stringBuffer2.append(this.f290178c);
        stringBuffer2.append("</staytotaltime>");
        LinkedList<C99158b> linkedList = this.f290186k;
        if (this.f290184i && linkedList.size() > 1) {
            C99158b bVar = new C99158b();
            for (int i = 0; i < this.f290186k.size(); i++) {
                C99158b bVar2 = this.f290186k.get(i);
                if (i == 0) {
                    bVar.f290742d = bVar2.f290742d;
                    bVar.f290743e = bVar2.f290743e;
                    bVar.f290744f = bVar2.f290744f;
                }
                bVar.f290740b += bVar2.f290740b;
                bVar.f290741c += bVar2.f290741c;
            }
            LinkedList<C99158b> linkedList2 = new LinkedList<>();
            linkedList2.add(bVar);
            linkedList = linkedList2;
        }
        stringBuffer2.append(String.format("<playitemlist count=\"%d\">", new Object[]{Integer.valueOf(linkedList.size())}));
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            C99158b bVar3 = linkedList.get(i2);
            stringBuffer2.append("<playitem>");
            stringBuffer2.append(String.format("<playcount>%d</playcount>", new Object[]{Integer.valueOf(bVar3.f290740b)}));
            stringBuffer2.append(String.format("<playtotaltime>%d</playtotaltime>", new Object[]{Integer.valueOf(bVar3.f290741c)}));
            stringBuffer2.append(String.format("<videototaltime>%d</videototaltime>", new Object[]{Integer.valueOf(bVar3.f290742d * 1000)}));
            stringBuffer2.append(String.format("<playmode>%d</playmode>", new Object[]{Integer.valueOf(bVar3.f290743e)}));
            stringBuffer2.append(String.format("<playorientation>%d</playorientation>", new Object[]{Integer.valueOf(bVar3.f290744f)}));
            stringBuffer2.append("</playitem>");
        }
        stringBuffer2.append("</playitemlist>");
        stringBuffer2.append("</viewinfo>");
        stringBuffer = stringBuffer2.toString();
        Log.m105924i(this.f290176a, "xml " + stringBuffer);
        SnsMethodCalculate.markEndTimeMs("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        return stringBuffer;
    }

    /* renamed from: e */
    public synchronized void mo138332e(int i) {
        SnsMethodCalculate.markStartTimeMs("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        C99158b bVar = this.f290185j;
        if (bVar.f290741c <= 0) {
            long j = bVar.f290745g;
            bVar.f290741c = j == 0 ? 0 : (int) Util.ticksToNow(j);
            mo138328a();
            String str = this.f290176a;
            StringBuilder sb = new StringBuilder();
            sb.append("endPlay, playTotaltime=");
            sb.append(this.f290185j.f290741c);
            sb.append(", pauseTotalTime=");
            sb.append(this.f290185j.f290746h);
            sb.append(", playTime=");
            C99158b bVar2 = this.f290185j;
            sb.append(((long) bVar2.f290741c) - bVar2.f290746h);
            Log.m105924i(str, sb.toString());
            C99158b bVar3 = this.f290185j;
            int i2 = bVar3.f290741c;
            long j2 = bVar3.f290746h;
            if (((long) i2) - j2 > 0) {
                bVar3.f290741c = (int) (((long) i2) - j2);
            }
        }
        if (i != 0) {
            this.f290185j.f290742d = i;
            this.f290187l = (long) i;
        }
        String str2 = this.f290176a;
        Log.m105924i(str2, "pushplayitem duration " + this.f290185j.f290741c + " " + this.f290185j.f290744f);
        this.f290186k.add(this.f290185j);
        this.f290185j = new C99158b();
        SnsMethodCalculate.markEndTimeMs("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    /* renamed from: f */
    public void mo138333f() {
        SnsMethodCalculate.markStartTimeMs("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        this.f290181f = 0;
        this.f290182g = 0;
        this.f290183h = 0;
        Iterator<C99158b> it = this.f290186k.iterator();
        while (it.hasNext()) {
            C99158b next = it.next();
            this.f290181f += next.f290739a;
            this.f290182g += next.f290740b;
            this.f290183h += next.f290741c;
        }
        C99158b bVar = this.f290185j;
        if (bVar != null && !this.f290186k.contains(bVar)) {
            int i = this.f290181f;
            C99158b bVar2 = this.f290185j;
            this.f290181f = i + bVar2.f290739a;
            this.f290182g += bVar2.f290740b;
            this.f290183h += bVar2.f290741c;
        }
        SnsMethodCalculate.markEndTimeMs("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public C98973p(String str) {
        this.f290176a = "MicroMsg.SnsAdVideoStatistic:" + str;
    }
}
