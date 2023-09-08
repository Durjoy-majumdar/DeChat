package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1195ge.C116947b;
import p210o.C11323a;
import p329d3.C86165a;

/* renamed from: oe.q$$x */
public final /* synthetic */ class q$$x implements C86165a {

    /* renamed from: a */
    public final /* synthetic */ C116947b.C116948a f352263a;

    /* renamed from: b */
    public final /* synthetic */ C11323a f352264b;

    /* renamed from: c */
    public final /* synthetic */ C114467i f352265c;

    public /* synthetic */ q$$x(C116947b.C116948a aVar, C11323a aVar2, C114467i iVar) {
        this.f352263a = aVar;
        this.f352264b = aVar2;
        this.f352265c = iVar;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        C116947b.C116948a aVar = this.f352263a;
        C11323a aVar2 = this.f352264b;
        C114467i iVar = this.f352265c;
        Map map = (Map) obj;
        double doubleValue = ((Double) aVar.f350471g.f343211a).doubleValue();
        boolean z = doubleValue < 0.0d || ((Long) aVar.f350501v.f343211a).longValue() < 0 || ((Long) aVar.f350503w.f343211a).longValue() < 0;
        map.put("power-cpu", aVar2.apply(new q$$y(doubleValue, aVar)));
        double doubleValue2 = ((Double) aVar.f350497t.f343211a).doubleValue();
        if (doubleValue2 < 0.0d) {
            z = true;
        }
        map.put("power-idle", aVar2.apply(new q$$h(doubleValue2, aVar)));
        double doubleValue3 = ((Double) aVar.f350473h.f343211a).doubleValue();
        boolean z2 = doubleValue3 < 0.0d ? true : z;
        map.put("power-wakelock", aVar2.apply(new q$$i(doubleValue3, aVar)));
        Iterator it = Arrays.asList(new String[]{"power-mobile-radio", "power-mobile-controller", "power-mobile-packet", "power-mobile-statByte", "power-mobile-statPacket"}).iterator();
        double d = 0.0d;
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            String str3 = (String) it.next();
            Object obj2 = aVar.f350469f.get(str3);
            double doubleValue4 = obj2 instanceof Double ? ((Double) obj2).doubleValue() : 0.0d;
            if (doubleValue4 > 0.0d) {
                String substring = str3.substring(str3.lastIndexOf("-") + 1);
                Log.m105924i("HealthStatsHelper", "estimate mobile: " + substring);
                d = doubleValue4;
                str = substring;
                break;
            }
            d = doubleValue4;
        }
        String str4 = "-";
        String str5 = "HealthStatsHelper";
        map.put("power-mobile", aVar2.apply(new q$$j(d, str, aVar, iVar)));
        Iterator it4 = Arrays.asList(new String[]{"power-wifi-controller", "power-wifi-packet", "power-wifi-statByte", "power-wifi-statPacket"}).iterator();
        double d2 = 0.0d;
        while (true) {
            if (!it4.hasNext()) {
                str2 = "";
                break;
            }
            String str6 = (String) it4.next();
            Object obj3 = aVar.f350469f.get(str6);
            double doubleValue5 = obj3 instanceof Double ? ((Double) obj3).doubleValue() : 0.0d;
            if (doubleValue5 > 0.0d) {
                String substring2 = str6.substring(str6.lastIndexOf(str4) + 1);
                Log.m105924i(str5, "estimate wifi: " + substring2);
                d2 = doubleValue5;
                str2 = substring2;
                break;
            }
            d2 = doubleValue5;
        }
        q$$k q__k = r1;
        q$$k q__k2 = new q$$k(d2, str2, aVar, iVar);
        map.put("power-wifi", aVar2.apply(q__k));
        double doubleValue6 = ((Double) aVar.f350479k.f343211a).doubleValue();
        if (doubleValue6 < 0.0d) {
            z2 = true;
        }
        map.put("power-bluetooth", aVar2.apply(new q$$m(doubleValue6, aVar)));
        double doubleValue7 = ((Double) aVar.f350481l.f343211a).doubleValue();
        if (doubleValue7 < 0.0d) {
            z2 = true;
        }
        map.put("power-gps", aVar2.apply(new q$$n(doubleValue7, aVar)));
        double doubleValue8 = ((Double) aVar.f350483m.f343211a).doubleValue();
        if (doubleValue8 < 0.0d) {
            z2 = true;
        }
        map.put("power-sensors", aVar2.apply(new q$$o(doubleValue8, aVar)));
        double doubleValue9 = ((Double) aVar.f350485n.f343211a).doubleValue();
        if (doubleValue9 < 0.0d) {
            z2 = true;
        }
        map.put("power-camera", aVar2.apply(new q$$p(doubleValue9, aVar)));
        double doubleValue10 = ((Double) aVar.f350487o.f343211a).doubleValue();
        if (doubleValue10 < 0.0d) {
            z2 = true;
        }
        map.put("power-flashlight", aVar2.apply(new q$$q(doubleValue10, aVar)));
        double doubleValue11 = ((Double) aVar.f350489p.f343211a).doubleValue();
        if (doubleValue11 < 0.0d) {
            z2 = true;
        }
        map.put("power-audio", aVar2.apply(new q$$z(doubleValue11, aVar)));
        double doubleValue12 = ((Double) aVar.f350491q.f343211a).doubleValue();
        if (doubleValue12 < 0.0d) {
            z2 = true;
        }
        map.put("power-video", aVar2.apply(new q$$a0(doubleValue12, aVar)));
        double doubleValue13 = ((Double) aVar.f350493r.f343211a).doubleValue();
        if (doubleValue13 < 0.0d) {
            z2 = true;
        }
        map.put("power-screen", aVar2.apply(new q$$b0(doubleValue13, aVar)));
        double doubleValue14 = ((Double) aVar.f350495s.f343211a).doubleValue();
        if (doubleValue14 < 0.0d) {
            z2 = true;
        }
        map.put("power-sysSrv", aVar2.apply(new q$$c0(doubleValue14, aVar)));
        map.put("power-total", aVar2.apply(new q$$b(aVar.mo180934d(), z2)));
        if (aVar.f343203b && iVar != null && b$$f.m166060e()) {
            for (Map.Entry next : aVar.f350469f.entrySet()) {
                String str7 = (String) next.getKey();
                Object value = next.getValue();
                if (str7.startsWith("power-mobile") && (value instanceof Double)) {
                    map.put(str7, aVar2.apply(new q$$c(((Double) value).doubleValue())));
                }
                if (str7.startsWith("power-wifi") && (value instanceof Double)) {
                    map.put(str7, aVar2.apply(new q$$d(((Double) value).doubleValue())));
                }
            }
            List<String> asList = Arrays.asList(new String[]{"JiffyUid", "TimeUid"});
            q$$e q__e = new q$$e(aVar);
            for (String str8 : asList) {
                Object obj4 = aVar.f350469f.get(str8);
                if (obj4 != null && (obj4 instanceof Map)) {
                    for (Map.Entry entry : ((Map) obj4).entrySet()) {
                        String valueOf = String.valueOf(entry.getKey());
                        Object value2 = entry.getValue();
                        if (valueOf.startsWith("power-cpu") && (value2 instanceof Double)) {
                            double doubleValue15 = ((Double) value2).doubleValue();
                            map.put(valueOf + str8, aVar2.apply(new q$$f(doubleValue15)));
                            map.put(valueOf.replace("power-cpu", "power-total") + str8, aVar2.apply(new q$$g(q__e, doubleValue15)));
                        }
                    }
                }
            }
        }
    }
}
