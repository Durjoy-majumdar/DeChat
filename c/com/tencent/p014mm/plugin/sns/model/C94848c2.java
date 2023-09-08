package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnClickActionStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ms2.C99967m;
import ms2.C99968n;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.c2 */
public class C94848c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99968n f274797d;

    /* renamed from: e */
    public final /* synthetic */ C99967m f274798e;

    /* renamed from: f */
    public final /* synthetic */ long f274799f;

    /* renamed from: g */
    public final /* synthetic */ String f274800g;

    /* renamed from: h */
    public final /* synthetic */ int f274801h;

    /* renamed from: i */
    public final /* synthetic */ C94974y1 f274802i;

    public C94848c2(C94974y1 y1Var, C99968n nVar, C99967m mVar, long j, String str, int i) {
        this.f274802i = y1Var;
        this.f274797d = nVar;
        this.f274798e = mVar;
        this.f274799f = j;
        this.f274800g = str;
        this.f274801h = i;
    }

    public void run() {
        int i;
        int i2;
        C99968n nVar;
        long j;
        int i3;
        C99968n nVar2;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$5");
        C94974y1 y1Var = this.f274802i;
        C99968n nVar3 = this.f274797d;
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        boolean j2 = y1Var.mo131309j(nVar3);
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (j2) {
            LinkedList linkedList = new LinkedList(this.f274797d.f292919g);
            linkedList.removeAll(this.f274797d.f292916d);
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            int i4 = 0;
            for (int i5 = 0; i5 < this.f274797d.f292916d.size(); i5++) {
                C94974y1.m120648b(this.f274802i);
                if (i5 < i4 * 50) {
                    List list = (List) linkedList2.peekLast();
                    if (list != null) {
                        list.add(this.f274797d.f292916d.get(i5));
                    }
                } else {
                    i4++;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f274797d.f292916d.get(i5));
                    linkedList2.add(arrayList);
                }
            }
            int i6 = 0;
            for (int i7 = 0; i7 < linkedList.size(); i7++) {
                C94974y1.m120648b(this.f274802i);
                if (i7 < i6 * 50) {
                    List list2 = (List) linkedList3.peekLast();
                    if (list2 != null) {
                        list2.add((Long) linkedList.get(i7));
                    }
                } else {
                    i6++;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add((Long) linkedList.get(i7));
                    linkedList3.add(arrayList2);
                }
            }
            int max = Math.max(linkedList3.size(), linkedList2.size());
            long currentTimeMillis = System.currentTimeMillis();
            int i8 = 0;
            while (i8 < max) {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                if (i8 < linkedList2.size()) {
                    List<Long> list3 = (List) linkedList2.get(i8);
                    i = list3.size();
                    for (Long longValue : list3) {
                        stringBuffer.append(C102236a0.m134763p0(longValue.longValue()));
                        stringBuffer.append("|");
                    }
                } else {
                    i = 0;
                }
                if (i8 < linkedList3.size()) {
                    List<Long> list4 = (List) linkedList3.get(i8);
                    i2 = list4.size();
                    for (Long longValue2 : list4) {
                        stringBuffer2.append(C102236a0.m134763p0(longValue2.longValue()));
                        stringBuffer2.append("|");
                    }
                } else {
                    i2 = 0;
                }
                int size = this.f274798e.f292913d.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        nVar = null;
                        break;
                    }
                    nVar = this.f274798e.f292913d.get(size);
                    if (nVar != null && !Util.isNullOrNil((List) nVar.f292916d)) {
                        break;
                    }
                }
                if (nVar == null || (nVar2 = this.f274797d) == null) {
                    j = currentTimeMillis;
                } else {
                    j = currentTimeMillis;
                    if (nVar.f292917e == nVar2.f292917e) {
                        i3 = 1;
                        TimelineMissReadJumpBtnClickActionStruct timelineMissReadJumpBtnClickActionStruct = new TimelineMissReadJumpBtnClickActionStruct();
                        timelineMissReadJumpBtnClickActionStruct.f266399e = this.f274799f;
                        timelineMissReadJumpBtnClickActionStruct.f266400f = this.f274797d.f292919g.peek().longValue();
                        timelineMissReadJumpBtnClickActionStruct.f266398d = timelineMissReadJumpBtnClickActionStruct.mo86045b("SessionId", this.f274800g, true);
                        timelineMissReadJumpBtnClickActionStruct.f266401g = (long) i3;
                        timelineMissReadJumpBtnClickActionStruct.f266402h = (long) this.f274801h;
                        timelineMissReadJumpBtnClickActionStruct.f266403i = timelineMissReadJumpBtnClickActionStruct.mo86045b("JumpBreakLayerFeeds", stringBuffer.toString(), true);
                        timelineMissReadJumpBtnClickActionStruct.f266404j = (long) i;
                        timelineMissReadJumpBtnClickActionStruct.f266405k = timelineMissReadJumpBtnClickActionStruct.mo86045b("JumpBreakLayerExposureFeeds", stringBuffer2.toString(), true);
                        timelineMissReadJumpBtnClickActionStruct.f266406l = (long) i2;
                        timelineMissReadJumpBtnClickActionStruct.f266407m = Util.secondsToNow(this.f274797d.f292917e);
                        long j3 = j;
                        timelineMissReadJumpBtnClickActionStruct.f266408n = j3;
                        timelineMissReadJumpBtnClickActionStruct.f266409o = (long) i8;
                        timelineMissReadJumpBtnClickActionStruct.f266410p = (long) max;
                        timelineMissReadJumpBtnClickActionStruct.mo86054n();
                        i8++;
                        currentTimeMillis = j3;
                    }
                }
                i3 = 2;
                TimelineMissReadJumpBtnClickActionStruct timelineMissReadJumpBtnClickActionStruct2 = new TimelineMissReadJumpBtnClickActionStruct();
                timelineMissReadJumpBtnClickActionStruct2.f266399e = this.f274799f;
                timelineMissReadJumpBtnClickActionStruct2.f266400f = this.f274797d.f292919g.peek().longValue();
                timelineMissReadJumpBtnClickActionStruct2.f266398d = timelineMissReadJumpBtnClickActionStruct2.mo86045b("SessionId", this.f274800g, true);
                timelineMissReadJumpBtnClickActionStruct2.f266401g = (long) i3;
                timelineMissReadJumpBtnClickActionStruct2.f266402h = (long) this.f274801h;
                timelineMissReadJumpBtnClickActionStruct2.f266403i = timelineMissReadJumpBtnClickActionStruct2.mo86045b("JumpBreakLayerFeeds", stringBuffer.toString(), true);
                timelineMissReadJumpBtnClickActionStruct2.f266404j = (long) i;
                timelineMissReadJumpBtnClickActionStruct2.f266405k = timelineMissReadJumpBtnClickActionStruct2.mo86045b("JumpBreakLayerExposureFeeds", stringBuffer2.toString(), true);
                timelineMissReadJumpBtnClickActionStruct2.f266406l = (long) i2;
                timelineMissReadJumpBtnClickActionStruct2.f266407m = Util.secondsToNow(this.f274797d.f292917e);
                long j35 = j;
                timelineMissReadJumpBtnClickActionStruct2.f266408n = j35;
                timelineMissReadJumpBtnClickActionStruct2.f266409o = (long) i8;
                timelineMissReadJumpBtnClickActionStruct2.f266410p = (long) max;
                timelineMissReadJumpBtnClickActionStruct2.mo86054n();
                i8++;
                currentTimeMillis = j35;
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$5");
    }
}
