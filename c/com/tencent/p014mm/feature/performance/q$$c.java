package com.tencent.p014mm.feature.performance;

import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import ie2.C117194a;
import p329d3.C58104c;
import p981ie.C117164j;

/* renamed from: com.tencent.mm.feature.performance.q$$c */
public final /* synthetic */ class q$$c implements C117164j {
    public final Object apply(Object obj) {
        C58104c cVar = (C58104c) obj;
        return (CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat) C80907o.m98783f((String) cVar.f166180b, new IPCInteger(((Integer) cVar.f166179a).intValue()), C117194a.class);
    }
}
