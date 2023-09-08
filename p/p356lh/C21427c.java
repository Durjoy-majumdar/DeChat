package p356lh;

import android.text.TextUtils;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C116768d;
import p339fh.C116869j;
import p339fh.C20709a;
import p339fh.C20710b;
import p339fh.C45782c;
import p339fh.C45784e;
import p343gh.C116963a;
import p343gh.C20833c;
import p343gh.C20834d;
import p343gh.C20835e;
import p346hh.C32907g;
import p348ih.C21076a;
import p348ih.C21078b;
import p348ih.C21079c;
import p348ih.C21087k;
import p348ih.C21090n;
import p354kh.C21333a;

/* renamed from: lh.c */
public class C21427c {

    /* renamed from: a */
    public C21428d f60632a;

    /* renamed from: b */
    public C21076a f60633b;

    /* renamed from: c */
    public HashMap<String, Boolean> f60634c = new HashMap<>();

    /* renamed from: d */
    public C32907g f60635d;

    /* renamed from: e */
    public C20833c f60636e;

    /* renamed from: f */
    public String f60637f;

    /* renamed from: g */
    public volatile boolean f60638g = false;

    public C21427c(boolean z) {
        C21428d dVar = new C21428d(z);
        this.f60632a = dVar;
        C21076a aVar = new C21076a(dVar);
        this.f60633b = aVar;
        this.f60632a.f60658t = aVar;
        this.f60635d = new C32907g((List<String>) null);
        this.f60636e = new C20833c();
    }

    /* renamed from: a */
    public void mo33563a(String str) {
        C20833c cVar = this.f60636e;
        String str2 = this.f60637f;
        cVar.getClass();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "cacheToFile appId:%s, filePath:%s", str2, str);
        C20834d dVar = new C20834d(new C116963a(str2, str), "AudioPcmDataTrackCacheToFileTask", 5);
        C21087k.m23341a();
        C21087k.m23342b(dVar);
    }

    /* renamed from: b */
    public final void mo33564b(C88912b bVar) {
        int i;
        bVar.f256441z = true;
        int d = this.f60632a.mo33583d(bVar.f256416a);
        C21428d dVar = this.f60632a;
        synchronized (dVar.f60645g) {
            Set<String> keySet = dVar.f60654p.keySet();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(keySet);
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                C21433g gVar = dVar.f60654p.get((String) it.next());
                if (gVar != null) {
                    if (!gVar.mo33599a(0)) {
                        if (!gVar.mo33599a(1)) {
                            if (!gVar.mo33599a(2)) {
                            }
                        }
                    }
                    i++;
                }
            }
        }
        if (!this.f60638g) {
            if (d <= 2000) {
                bVar.f256441z = false;
            }
            if (d >= 5000) {
                bVar.f256441z = true;
            } else if (i <= 5) {
                bVar.f256441z = false;
            } else {
                bVar.f256441z = true;
            }
            if (bVar.f256418c.contains("scale_intro")) {
                bVar.f256441z = false;
            }
        }
        if (i > 5) {
            C21428d dVar2 = this.f60632a;
            dVar2.f60657s.clear();
            dVar2.f60664z.clear();
            synchronized (dVar2.f60645g) {
                dVar2.f60664z.addAll(dVar2.f60654p.keySet());
                Iterator<String> it4 = dVar2.f60664z.iterator();
                while (it4.hasNext()) {
                    String next = it4.next();
                    C21433g gVar2 = dVar2.f60654p.get(next);
                    if (gVar2 != null) {
                        if (gVar2.mo33599a(2)) {
                            dVar2.f60657s.add(next);
                        }
                    }
                }
            }
            ArrayList<String> arrayList2 = dVar2.f60657s;
            if (arrayList2.contains(bVar.f256416a)) {
                arrayList2.remove(bVar.f256416a);
            }
            if (arrayList2.size() > 2) {
                Object[] objArr = {Integer.valueOf(arrayList2.size())};
                int i2 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "do stop paused audio size:%d", objArr);
                Iterator<String> it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    mo33580r(it5.next());
                }
            }
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(d), Boolean.valueOf(bVar.f256441z)};
        int i3 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "playingCount:%d, duration:%d, supportMixPlay:%b", objArr2);
    }

    /* renamed from: c */
    public long mo33565c() {
        long j;
        C116869j a = C116869j.m164845a();
        synchronized (a.f350296c) {
            Iterator<String> it = a.f350294a.iterator();
            j = 0;
            while (it.hasNext()) {
                C116768d dVar = a.f350295b.get(it.next());
                if (dVar != null && dVar.f350073b && !dVar.f350080i) {
                    j += dVar.mo180737c();
                }
            }
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo33566d(String str) {
        C88912b c = this.f60632a.mo33582c(str);
        if (c == null) {
            return false;
        }
        if (this.f60634c.containsKey(c.f256418c)) {
            return this.f60634c.get(c.f256418c).booleanValue();
        }
        boolean d = C116869j.m164845a().mo180855d(c.f256418c);
        if (d) {
            this.f60634c.put(c.f256418c, Boolean.valueOf(d));
        }
        return d;
    }

    /* renamed from: e */
    public boolean mo33567e(String str) {
        if (this.f60634c.containsKey(str)) {
            return this.f60634c.get(str).booleanValue();
        }
        boolean d = C116869j.m164845a().mo180855d(str);
        if (d) {
            this.f60634c.put(str, Boolean.valueOf(d));
        }
        return d;
    }

    /* renamed from: f */
    public boolean mo33568f(String str) {
        return this.f60632a.f60651m.containsKey(str);
    }

    /* renamed from: g */
    public boolean mo33569g(String str) {
        C21433g gVar;
        C21428d dVar = this.f60632a;
        if (!dVar.f60654p.containsKey(str) || (gVar = dVar.f60654p.get(str)) == null) {
            return false;
        }
        return gVar.mo33599a(2);
    }

    /* renamed from: h */
    public boolean mo33570h(String str) {
        return this.f60632a.mo33588i(str);
    }

    /* renamed from: i */
    public boolean mo33571i(String str) {
        C21433g gVar;
        C21428d dVar = this.f60632a;
        if (!dVar.f60654p.containsKey(str) || (gVar = dVar.f60654p.get(str)) == null) {
            return false;
        }
        return gVar.mo33599a(7);
    }

    /* renamed from: j */
    public boolean mo33572j(String str) {
        C21433g gVar;
        C21428d dVar = this.f60632a;
        if (!dVar.f60654p.containsKey(str) || (gVar = dVar.f60654p.get(str)) == null) {
            return false;
        }
        return gVar.mo33599a(9);
    }

    /* renamed from: k */
    public boolean mo33573k(String str) {
        C21428d dVar = this.f60632a;
        if (dVar.f60653o.containsKey(str)) {
            return dVar.f60653o.get(str).booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    public void mo33574l() {
        C21076a aVar = this.f60633b;
        aVar.getClass();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "pauseAllOnBackground", (Object[]) null);
        ArrayList arrayList = new ArrayList();
        synchronized (aVar.f59594f) {
            arrayList.addAll(aVar.f59593e);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C21078b bVar = aVar.f59590b.get((String) it.next());
            if (bVar != null && !bVar.f59597h) {
                C21090n nVar = bVar.f59598i;
                if (nVar == null) {
                    z = true;
                }
                if (!z && nVar != null && !((C21079c) nVar).mo32812g()) {
                    nVar.mo32808b();
                }
            }
        }
        C21428d dVar = this.f60632a;
        dVar.getClass();
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "pauseAllOnBackground", (Object[]) null);
        C21333a aVar2 = dVar.f60647i;
        aVar2.getClass();
        Log.m105925i("MicroMsg.Mix.AudioMixController", "pauseMix", (Object[]) null);
        aVar2.f60297d.set(true);
        int i3 = aVar2.f60315v;
        if (i3 > 0) {
            long j = aVar2.f60316w / ((long) i3);
            aVar2.f60314u = j;
            Log.m105925i("MicroMsg.Mix.AudioMixController", "mixAverageTime:%d", Long.valueOf(j));
        }
        aVar2.f60315v = 0;
        aVar2.f60316w = 0;
        dVar.f60640b.set(false);
        dVar.f60642d.set(true);
        dVar.f60641c.set(false);
        dVar.mo33594o();
        synchronized (dVar) {
            Thread thread = dVar.f60646h;
            if (thread != null) {
                Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "stop playback thread id:%d", Long.valueOf(thread.getId()));
                dVar.f60646h = null;
            }
        }
        C32907g gVar = this.f60635d;
        gVar.getClass();
        if (C32907g.f89459d == 0) {
            C32907g.f89459d = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - C32907g.f89459d <= C32907g.f89458c.longValue()) {
            Log.m105921e("MicroMsg.Mix.AudioScanConvertCacheController", "startClean the last clean time is in AUDIO_MIX_NO_SCAN_TIME time", (Object[]) null);
        } else {
            C32907g.f89459d = currentTimeMillis;
            Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "start scan audio mix convert file", (Object[]) null);
            C21087k.m23342b(new C32907g.C20940a("clean audio mix convert cache", 5));
        }
        C116869j a = C116869j.m164845a();
        synchronized (a.f350296c) {
            Iterator<String> it4 = a.f350294a.iterator();
            while (it4.hasNext()) {
                C116768d dVar2 = a.f350295b.get(it4.next());
                if (dVar2 != null && dVar2.f350073b && dVar2.f350080i) {
                    synchronized (dVar2) {
                        if (dVar2.f350081j != null) {
                            int i4 = C11412b.f33577a;
                            Log.m105925i("MicroMsg.Mix.PcmBufferProvider", "closeCacheFileWithNoDiscard success", (Object[]) null);
                            dVar2.f350081j.mo180733a();
                            dVar2.f350081j = null;
                        }
                    }
                }
            }
        }
        C45784e c = C45784e.m51066c();
        c.getClass();
        int i5 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "saveData", (Object[]) null);
        C20834d dVar3 = new C20834d(new C45782c(c), "saveData", 5);
        C21087k.m23341a();
        C21087k.m23342b(dVar3);
    }

    /* renamed from: m */
    public void mo33575m(C88912b bVar) {
        C20835e eVar;
        C21433g gVar;
        this.f60637f = bVar.f256429n;
        Object[] objArr = {bVar.f256416a};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "preparePlay:%s", objArr);
        C45784e c = C45784e.m51066c();
        String str = this.f60637f;
        if (!TextUtils.isEmpty(c.f123681b) && !str.equals(c.f123681b)) {
            Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, (Object[]) null);
            String str2 = c.f123681b;
            c.f123681b = str;
            eVar = new C20709a(c, str2, str);
        } else if (TextUtils.isEmpty(c.f123681b)) {
            c.f123681b = str;
            Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, (Object[]) null);
            eVar = new C20710b(c, str);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            C20834d dVar = new C20834d(eVar, "init cache path", 5);
            C21087k.m23341a();
            C21087k.m23342b(dVar);
        }
        if (mo33567e(bVar.f256418c) && bVar.f256422g) {
            mo33564b(bVar);
        }
        C21428d dVar2 = this.f60632a;
        dVar2.getClass();
        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "preparePlay", (Object[]) null);
        boolean z = bVar.f256414A;
        if (z || !bVar.f256422g) {
            if (z) {
                synchronized (dVar2.f60645g) {
                    if (dVar2.f60654p.containsKey(bVar.f256416a) && (gVar = dVar2.f60654p.get(bVar.f256416a)) != null) {
                        if (gVar.mo33599a(4)) {
                            dVar2.f60654p.remove(bVar.f256416a);
                        }
                    }
                }
            }
        } else if (dVar2.f60640b.get()) {
            dVar2.mo33592m();
        } else {
            dVar2.mo33587h();
        }
        dVar2.f60651m.put(bVar.f256416a, bVar);
        synchronized (dVar2.f60645g) {
            dVar2.f60656r.put(bVar.f256416a, Boolean.FALSE);
        }
        dVar2.f60647i.mo33376l(bVar.f256416a);
        C21333a aVar = dVar2.f60647i;
        aVar.getClass();
        Log.m105925i("MicroMsg.Mix.AudioMixController", "prepareMix", (Object[]) null);
        aVar.f60296c.set(false);
        aVar.f60297d.set(false);
        if (aVar.f60301h == null) {
            Thread thread = new Thread(aVar.f60317x, "audio_mix_controller");
            aVar.f60301h = thread;
            thread.start();
        }
        synchronized (aVar.f60300g) {
            try {
                aVar.f60300g.notify();
            } catch (Exception e) {
                int i2 = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "notifyMix", new Object[0]);
            }
        }
        this.f60633b.mo32802d(bVar);
    }

    /* renamed from: n */
    public void mo33576n(String str) {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "remove audioId:%s", str);
        C21428d dVar = this.f60632a;
        dVar.f60651m.remove(str);
        dVar.f60652n.remove(str);
        dVar.f60653o.remove(str);
        synchronized (dVar.f60645g) {
            dVar.f60654p.remove(str);
            dVar.f60656r.remove(str);
        }
        dVar.f60655q.remove(str);
        C21076a aVar = this.f60633b;
        if (aVar.f59590b.containsKey(str) && aVar.f59593e.contains(str)) {
            aVar.mo32805g(str);
        }
        aVar.f59591c.remove(str);
        synchronized (aVar.f59594f) {
            aVar.f59593e.remove(str);
        }
    }

    /* renamed from: o */
    public void mo33577o(String str) {
        Object[] objArr = {str, Integer.valueOf(this.f60632a.mo33586g(str))};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "resume audioId:%s, audio state:%d", objArr);
        mo33564b(this.f60632a.mo33582c(str));
        C21428d dVar = this.f60632a;
        dVar.f60642d.set(false);
        dVar.f60641c.set(false);
        dVar.mo33594o();
        dVar.mo33592m();
        synchronized (dVar.f60645g) {
            dVar.f60656r.put(str, Boolean.FALSE);
        }
        dVar.f60647i.mo33376l(str);
        dVar.f60652n.remove(str);
        dVar.f60653o.put(str, Boolean.TRUE);
        if (dVar.f60658t.mo32801c(str) && dVar.f60658t.mo32800b(str)) {
            dVar.mo33590k(1, str);
        }
        C21076a aVar = this.f60633b;
        aVar.getClass();
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "startDecode audioId:%s", str);
        aVar.mo32799a(str, false, false);
    }

    /* renamed from: p */
    public void mo33578p(C88912b bVar) {
        C21428d dVar = this.f60632a;
        dVar.f60651m.put(bVar.f256416a, bVar);
        if (dVar.mo33585f() == 1) {
            String str = bVar.f256416a;
            if ((dVar.f60651m.containsKey(str) ? dVar.f60651m.get(str).f256441z : false) && dVar.mo33588i(bVar.f256416a)) {
                float f = (float) bVar.f256427l;
                dVar.mo33593n(f, f);
                Object[] objArr = {Double.valueOf(bVar.f256427l)};
                int i = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "setPlayParam setVolume:%f", objArr);
            }
        }
        this.f60633b.f59591c.put(bVar.f256416a, bVar);
    }

    /* renamed from: q */
    public void mo33579q(boolean z) {
        C21076a aVar = this.f60633b;
        synchronized (aVar.f59594f) {
            Iterator<String> it = aVar.f59593e.iterator();
            while (it.hasNext()) {
                aVar.f59591c.get(it.next()).f256441z = z;
            }
        }
    }

    /* renamed from: r */
    public void mo33580r(String str) {
        Object[] objArr = {str, Integer.valueOf(this.f60632a.mo33586g(str))};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "stop audioId:%s, audio state:%d", objArr);
        C21428d dVar = this.f60632a;
        C21333a aVar = dVar.f60647i;
        aVar.f60299f.put(str, Boolean.TRUE);
        aVar.mo33374j(str);
        if (aVar.f60302i.isEmpty()) {
            Log.m105925i("MicroMsg.Mix.AudioMixController", "stopMix isMute", (Object[]) null);
            aVar.f60298e.set(true);
            aVar.f60295b.mo33593n(0.0f, 0.0f);
        } else {
            aVar.f60298e.set(false);
        }
        synchronized (dVar.f60645g) {
            dVar.f60656r.remove(str);
        }
        dVar.f60652n.remove(str);
        dVar.f60653o.put(str, Boolean.FALSE);
        if (dVar.f60658t.mo32801c(str)) {
            dVar.mo33590k(3, str);
        }
        this.f60633b.mo32805g(str);
    }

    /* renamed from: s */
    public void mo33581s(C88912b bVar) {
        C21078b bVar2;
        C21090n nVar;
        C21428d dVar = this.f60632a;
        boolean z = true;
        if (dVar.f60651m.containsKey(bVar.f256416a)) {
            dVar.f60651m.put(bVar.f256416a, bVar);
            if (dVar.mo33585f() == 1) {
                String str = bVar.f256416a;
                if ((dVar.f60651m.containsKey(str) ? dVar.f60651m.get(str).f256441z : false) && dVar.mo33588i(bVar.f256416a)) {
                    float f = (float) bVar.f256427l;
                    dVar.mo33593n(f, f);
                    Object[] objArr = {Double.valueOf(bVar.f256427l)};
                    int i = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "update setVolume:%f", objArr);
                }
            }
        }
        C21076a aVar = this.f60633b;
        if (aVar.f59591c.containsKey(bVar.f256416a)) {
            aVar.f59591c.put(bVar.f256416a, bVar);
            if (!aVar.mo32801c(bVar.f256416a) && (bVar2 = aVar.f59590b.get(bVar.f256416a)) != null && (nVar = bVar2.f59598i) != null) {
                C21079c cVar = (C21079c) nVar;
                if (!(cVar.f59607i.get() == 8 || cVar.f59607i.get() == 7)) {
                    z = false;
                }
                if (!z) {
                    float f2 = (float) bVar.f256427l;
                    nVar.mo32807a(f2, f2);
                }
            }
        }
    }
}
