package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.Iterator;
import java.util.LinkedList;
import os2.C100398c0;
import te3.C50660oc0;
import te3.C51865wq1;
import te3.jg4;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.l */
public class C43038l {
    /* renamed from: a */
    public static long m46673a(long j) {
        SnsMethodCalculate.markStartTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if (j == Long.MIN_VALUE) {
            SnsMethodCalculate.markEndTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        long j2 = j - 1;
        SnsMethodCalculate.markEndTimeMs("UnsignedLongMinuOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j2;
    }

    /* renamed from: b */
    public static long m46674b(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if ((i <= 0 || j2 <= 0) && (i >= 0 || j2 >= 0)) {
            long j3 = i < 0 ? 1 : -1;
            SnsMethodCalculate.markEndTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return j3;
        }
        long j4 = j - j2;
        SnsMethodCalculate.markEndTimeMs("compareUnsignedLong", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return j4;
    }

    /* renamed from: c */
    public static int m46675c(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        SnsMethodCalculate.markStartTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        if (j3 == 0) {
            Log.m105920e("MicroMsg.FaultLogic", "minId == 0.");
            SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        LinkedList<C50660oc0> linkedList = C94866e1.Xx0().mo139778Ow(str).f144227d;
        Log.m105925i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", Integer.valueOf(linkedList.size()));
        if (linkedList.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        C50660oc0 first = linkedList.getFirst();
        if (m46674b(first.f139085e, j3) > 0) {
            Log.m105920e("MicroMsg.FaultLogic", "has a fault，minId:" + j4 + " fault.min:" + first.f139085e);
            SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i == 0 || m46674b(first.f139084d, j4) >= 0) {
            LinkedList<jg4> linkedList2 = first.f139086f;
            Log.m105925i("MicroMsg.FaultLogic", "getLastReqTimeByMinId segmentList %s", Integer.valueOf(linkedList2.size()));
            if (linkedList2.isEmpty()) {
                SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
                return 0;
            }
            Iterator<jg4> it = linkedList2.iterator();
            int i2 = Integer.MAX_VALUE;
            while (it.hasNext()) {
                jg4 next = it.next();
                Iterator<jg4> it4 = it;
                if (i == 0 || m46674b(j4, next.f136112e) >= 0) {
                    int i3 = next.f136113f;
                    if (i3 < i2) {
                        i2 = i3;
                    }
                    if (m46674b(j3, next.f136112e) >= 0) {
                        Log.m105925i("MicroMsg.FaultLogic", "getLastReqTimeByMinId result %s", Integer.valueOf(i2));
                        int i4 = i2 == Integer.MAX_VALUE ? 0 : i2;
                        SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        return i4;
                    }
                }
                it = it4;
            }
            Log.m105924i("MicroMsg.FaultLogic", "should not to hear minId:" + j3);
            SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return 0;
        }
        Log.m105920e("MicroMsg.FaultLogic", "has part of a fault, maxId:" + j4 + " fault.max:" + first.f139084d);
        SnsMethodCalculate.markEndTimeMs("getLastReqTimeByMinId", "com.tencent.mm.plugin.sns.model.FaultLogic");
        return 0;
    }

    /* renamed from: d */
    public static void m46676d(String str, long j, long j2, int i) {
        long j3;
        C50660oc0 oc02;
        String str2;
        long j4;
        String str3 = str;
        long j5 = j2;
        SnsMethodCalculate.markStartTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
        Log.m105925i("MicroMsg.FaultLogic", "updateFault userName:%s ", str3);
        long j6 = 0;
        if (j5 == 0) {
            SnsMethodCalculate.markEndTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return;
        }
        C51865wq1 Ow = C94866e1.Xx0().mo139778Ow(str3);
        if (j != 0) {
            j3 = j;
        } else if (Ow.f144227d.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
            return;
        } else {
            j3 = Ow.f144227d.getFirst().f139084d;
        }
        C50660oc0 oc03 = new C50660oc0();
        oc03.f139084d = j3;
        oc03.f139085e = j5;
        jg4 jg4 = new jg4();
        jg4.f136111d = j3;
        jg4.f136112e = j5;
        jg4.f136113f = i;
        oc03.f139086f.add(jg4);
        while (true) {
            if (Ow.f144227d.isEmpty()) {
                break;
            }
            C50660oc0 first = Ow.f144227d.getFirst();
            if (m46674b(oc03.f139085e, first.f139084d) > j6) {
                Log.m105920e("MicroMsg.FaultLogic", "has a fault: newerMin:" + oc03.f139085e + " fault.Max" + first.f139084d);
                break;
            }
            Ow.f144227d.removeFirst();
            String str4 = "unionFault";
            SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.model.FaultLogic");
            C50660oc0 oc04 = new C50660oc0();
            C51865wq1 wq12 = Ow;
            if (m46674b(first.f139084d, oc03.f139084d) > j6) {
                oc04.f139084d = first.f139084d;
            } else {
                oc04.f139084d = oc03.f139084d;
            }
            if (m46674b(first.f139085e, oc03.f139085e) < j6) {
                oc04.f139085e = first.f139085e;
            } else {
                oc04.f139085e = oc03.f139085e;
            }
            LinkedList<jg4> linkedList = first.f139086f;
            Iterator<jg4> it = oc03.f139086f.iterator();
            while (it.hasNext()) {
                jg4 next = it.next();
                SnsMethodCalculate.markStartTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                if (linkedList.isEmpty()) {
                    Log.m105920e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
                    linkedList.addFirst(next);
                    SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    str2 = str4;
                    oc02 = oc04;
                } else {
                    long j7 = next.f136112e;
                    SnsMethodCalculate.markStartTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int size = linkedList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            SnsMethodCalculate.markEndTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            size = -1;
                            break;
                        } else if (m46674b(j7, linkedList.get(size).f136111d) <= 0) {
                            SnsMethodCalculate.markEndTimeMs("getSmallerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        } else {
                            size--;
                        }
                    }
                    long j8 = next.f136111d;
                    SnsMethodCalculate.markStartTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= linkedList.size()) {
                            str2 = str4;
                            oc02 = oc04;
                            i2 = linkedList.size();
                            SnsMethodCalculate.markEndTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        }
                        str2 = str4;
                        oc02 = oc04;
                        if (m46674b(j8, linkedList.get(i2).f136112e) >= 0) {
                            SnsMethodCalculate.markEndTimeMs("getBiggerIndex", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            break;
                        }
                        i2++;
                        str4 = str2;
                        oc04 = oc02;
                    }
                    if (size == -1) {
                        linkedList.addFirst(next);
                        SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else if (i2 == linkedList.size()) {
                        linkedList.addLast(next);
                        SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    } else {
                        jg4 jg42 = linkedList.get(i2);
                        if (m46674b(next.f136111d, jg42.f136111d) < 0) {
                            jg4 jg43 = new jg4();
                            jg43.f136111d = jg42.f136111d;
                            long j9 = next.f136111d;
                            SnsMethodCalculate.markStartTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            if (j9 == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                                j4 = Long.MIN_VALUE;
                                SnsMethodCalculate.markEndTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            } else {
                                j4 = j9 + 1;
                                SnsMethodCalculate.markEndTimeMs("UnsingedLongAddOne", "com.tencent.mm.plugin.sns.model.FaultLogic");
                            }
                            jg43.f136112e = j4;
                            jg43.f136113f = jg42.f136113f;
                            linkedList.add(i2, jg43);
                            size++;
                            i2++;
                        }
                        jg4 jg44 = linkedList.get(size);
                        if (m46674b(next.f136112e, jg44.f136112e) > 0) {
                            jg4 jg45 = new jg4();
                            jg45.f136112e = jg44.f136112e;
                            jg45.f136111d = m46673a(next.f136112e);
                            jg45.f136113f = jg44.f136113f;
                            linkedList.add(size + 1, jg45);
                        }
                        while (size >= i2) {
                            linkedList.remove(size);
                            size--;
                        }
                        linkedList.add(i2, next);
                        SnsMethodCalculate.markStartTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        if (linkedList.size() <= 100) {
                            SnsMethodCalculate.markEndTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        } else {
                            long j15 = linkedList.getLast().f136112e;
                            long j16 = linkedList.getLast().f136111d;
                            int i3 = linkedList.getLast().f136113f;
                            while (linkedList.size() >= 100) {
                                jg4 removeLast = linkedList.removeLast();
                                long j17 = removeLast.f136111d;
                                int i4 = removeLast.f136113f;
                                if (i4 < i3) {
                                    i3 = i4;
                                }
                                j16 = j17;
                            }
                            jg4 jg46 = new jg4();
                            jg46.f136111d = j16;
                            jg46.f136112e = j15;
                            jg46.f136113f = i3;
                            linkedList.addLast(jg46);
                            SnsMethodCalculate.markEndTimeMs("checkLimitCount", "com.tencent.mm.plugin.sns.model.FaultLogic");
                        }
                        SnsMethodCalculate.markEndTimeMs("unionSegment", "com.tencent.mm.plugin.sns.model.FaultLogic");
                    }
                }
                str4 = str2;
                oc04 = oc02;
            }
            C50660oc0 oc05 = oc04;
            oc05.f139086f = linkedList;
            SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.model.FaultLogic");
            oc03 = oc05;
            Ow = wq12;
            j6 = 0;
        }
        C51865wq1 wq13 = Ow;
        wq13.f144227d.addFirst(oc03);
        while (wq13.f144227d.size() > 100) {
            wq13.f144227d.removeLast();
        }
        if (wq13.f144227d.size() > 0) {
            Log.m105924i("MicroMsg.FaultLogic", "min " + C102236a0.m134765q0(wq13.f144227d.get(0).f139085e) + " max " + C102236a0.m134765q0(wq13.f144227d.get(0).f139084d));
        }
        C100398c0 Yt = C94866e1.Xx0().mo139782Yt(str3);
        try {
            Yt.field_userName = str3;
            Yt.field_faultS = wq13.toByteArray();
            C94866e1.Xx0().mo139790nP(Yt);
        } catch (Exception unused) {
        }
        if (wq13.f144227d.size() > 1) {
            Log.m105924i("MicroMsg.FaultLogic", "fault size : " + wq13.f144227d.size());
            Iterator<C50660oc0> it4 = wq13.f144227d.iterator();
            while (it4.hasNext()) {
                C50660oc0 next2 = it4.next();
                Log.m105924i("MicroMsg.FaultLogic", "min - max " + C102236a0.m134765q0(next2.f139085e) + " " + C102236a0.m134765q0(next2.f139084d));
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateFault", "com.tencent.mm.plugin.sns.model.FaultLogic");
    }
}
