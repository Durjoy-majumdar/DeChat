package cw2;

import com.tencent.p014mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61925b;
import rx3.C13598b0;

/* renamed from: cw2.m */
public final class C97389m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f285888d;

    /* renamed from: e */
    public final /* synthetic */ long f285889e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<String> f285890f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97389m(long j, long j2, ArrayList<String> arrayList) {
        super(0);
        this.f285888d = j;
        this.f285889e = j2;
        this.f285890f = arrayList;
    }

    public Object invoke() {
        C61925b bVar = new C61925b("reportWaitPlayList");
        StorySnsPlayInfoReportStruct storySnsPlayInfoReportStruct = new StorySnsPlayInfoReportStruct();
        storySnsPlayInfoReportStruct.f266294d = this.f285888d;
        storySnsPlayInfoReportStruct.f266295e = this.f285889e;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        Iterator<String> it = this.f285890f.iterator();
        int i = 1;
        while (it.hasNext()) {
            String next = it.next();
            C87412m.m108593f(next, "username");
            int i2 = i;
            long j = StoryCore.f281736t.mo134189g().mo138646jo(next).field_syncId;
            int length = String.valueOf(j).length();
            Iterator<String> it4 = it;
            if (sb.length() + length < 1000) {
                sb.append(j);
                sb.append("|");
            } else if (sb4.length() + length < 1000) {
                sb4.append(j);
                sb4.append("|");
            } else if (sb5.length() + length < 1000) {
                sb5.append(j);
                sb5.append("|");
            } else {
                storySnsPlayInfoReportStruct.f266296f = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList", sb.substring(0, sb.length()).toString(), true);
                storySnsPlayInfoReportStruct.f266299i = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList1", sb4.substring(0, sb4.length()).toString(), true);
                storySnsPlayInfoReportStruct.f266300j = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList2", sb5.substring(0, sb5.length()).toString(), true);
                int i3 = i2;
                storySnsPlayInfoReportStruct.f266298h = (long) i3;
                Log.m105924i("MicroMsg.StoryExtInfoStorageLogic", "split reportWaitPlayList " + this.f285888d + ' ' + i3 + ' ' + storySnsPlayInfoReportStruct.f266296f.length() + ' ' + storySnsPlayInfoReportStruct.f266296f + storySnsPlayInfoReportStruct.f266299i.length() + ' ' + storySnsPlayInfoReportStruct.f266299i + storySnsPlayInfoReportStruct.f266300j.length() + ' ' + storySnsPlayInfoReportStruct.f266300j);
                storySnsPlayInfoReportStruct.mo86054n();
                storySnsPlayInfoReportStruct = new StorySnsPlayInfoReportStruct();
                storySnsPlayInfoReportStruct.f266294d = this.f285888d;
                storySnsPlayInfoReportStruct.f266295e = this.f285889e;
                i = i3 + 1;
                sb.setLength(0);
                sb4.setLength(0);
                sb5.setLength(0);
                it = it4;
            }
            i = i2;
            it = it4;
        }
        int i4 = i;
        storySnsPlayInfoReportStruct.f266296f = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList", sb.substring(0, sb.length()).toString(), true);
        storySnsPlayInfoReportStruct.f266299i = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList1", sb4.substring(0, sb4.length()).toString(), true);
        storySnsPlayInfoReportStruct.f266300j = storySnsPlayInfoReportStruct.mo86045b("WaitPlayVideoList2", sb5.substring(0, sb5.length()).toString(), true);
        storySnsPlayInfoReportStruct.f266298h = (long) i4;
        Log.m105924i("MicroMsg.StoryExtInfoStorageLogic", "final reportWaitPlayList " + this.f285888d + ' ' + i4 + ' ' + storySnsPlayInfoReportStruct.f266296f.length() + ' ' + storySnsPlayInfoReportStruct.f266296f + storySnsPlayInfoReportStruct.f266299i.length() + ' ' + storySnsPlayInfoReportStruct.f266299i + storySnsPlayInfoReportStruct.f266300j.length() + ' ' + storySnsPlayInfoReportStruct.f266300j);
        storySnsPlayInfoReportStruct.mo86054n();
        new StorySnsPlayInfoReportStruct();
        bVar.mo86838a();
        return C13598b0.f38549a;
    }
}
