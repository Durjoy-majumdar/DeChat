package p348ih;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C116768d;
import p339fh.C116869j;
import p356lh.C21428d;
import p366nh.C21630a;

/* renamed from: ih.a */
public class C21076a {

    /* renamed from: a */
    public C21428d f59589a;

    /* renamed from: b */
    public HashMap<String, C21078b> f59590b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, C88912b> f59591c = new HashMap<>();

    /* renamed from: d */
    public List<String> f59592d = new ArrayList();

    /* renamed from: e */
    public LinkedList<String> f59593e = new LinkedList<>();

    /* renamed from: f */
    public Object f59594f = new Object();

    /* renamed from: ih.a$a */
    public class C21077a implements C21089m {
        public C21077a() {
        }
    }

    public C21076a(C21428d dVar) {
        this.f59589a = dVar;
        C116869j a = C116869j.m164845a();
        synchronized (a.f350296c) {
            Iterator<String> it = a.f350294a.iterator();
            while (it.hasNext()) {
                C116768d dVar2 = a.f350295b.get(it.next());
                if (dVar2 != null) {
                    dVar2.mo180742h();
                }
            }
            a.f350294a.clear();
            a.f350295b.clear();
        }
    }

    /* renamed from: a */
    public final boolean mo32799a(String str, boolean z, boolean z2) {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "doDecodeAudio", (Object[]) null);
        if (this.f59589a == null) {
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "mPlayer is null!", (Object[]) null);
            return false;
        }
        C88912b bVar = this.f59591c.get(str);
        if (bVar == null) {
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", str);
            return false;
        }
        C21078b bVar2 = this.f59590b.get(str);
        if (bVar2 != null) {
            if (bVar2.f59597h && !this.f59589a.f60647i.mo33369e() && !this.f59589a.f60647i.mo33367c(str)) {
                Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", (Object[]) null);
                return true;
            } else if (bVar2.f59597h) {
                Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "task is end, reset source and decoder to run", (Object[]) null);
                bVar2.f59597h = false;
                bVar2.f59598i = C21085h.m23340a(this.f59589a, new C21630a(bVar), 1, z2);
                bVar2.f59645f = System.currentTimeMillis();
                C21087k.m23342b(bVar2);
                return true;
            } else {
                C21090n nVar = bVar2.f59598i;
                if (nVar == null || !z) {
                    if (nVar != null) {
                        C21079c cVar = (C21079c) nVar;
                        if (cVar.mo32812g() && !cVar.mo32814h()) {
                            Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "resume decoder to run", (Object[]) null);
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "resume", (Object[]) null);
                            cVar.mo32821o(4);
                            synchronized (cVar.f59618t) {
                                if (cVar.mo32812g()) {
                                    cVar.f59608j.set(false);
                                    try {
                                        cVar.f59618t.notify();
                                    } catch (Exception e) {
                                        Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e, "resume", new Object[0]);
                                    }
                                }
                            }
                            return true;
                        }
                    }
                    if (nVar != null && ((C21079c) nVar).mo32814h()) {
                        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "decoder to stop, reset task run", (Object[]) null);
                        bVar2.f59597h = false;
                        bVar2.f59598i = C21085h.m23340a(this.f59589a, new C21630a(bVar), 1, z2);
                        bVar2.f59645f = System.currentTimeMillis();
                        C21087k.m23342b(bVar2);
                        return true;
                    } else if (nVar != null) {
                        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "task is run and playing audio", (Object[]) null);
                        return true;
                    }
                } else {
                    Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "force decode to stop and create new task to run", (Object[]) null);
                    ((C21079c) nVar).mo32830v();
                }
            }
        }
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "task is not exist, create new task to run", (Object[]) null);
        C21090n a = C21085h.m23340a(this.f59589a, new C21630a(bVar), 1, z2);
        C21078b bVar3 = new C21078b(new C21077a(), str, 5);
        bVar3.f59598i = a;
        bVar3.f59645f = System.currentTimeMillis();
        C21087k.m23342b(bVar3);
        this.f59590b.put(str, bVar3);
        synchronized (this.f59594f) {
            if (!this.f59593e.contains(str)) {
                this.f59593e.add(str);
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo32800b(String str) {
        C21078b bVar = this.f59590b.get(str);
        if (bVar == null || !bVar.f59597h || this.f59589a.f60647i.mo33369e() || this.f59589a.f60647i.mo33367c(str)) {
            return false;
        }
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end", (Object[]) null);
        return true;
    }

    /* renamed from: c */
    public boolean mo32801c(String str) {
        C21078b bVar = this.f59590b.get(str);
        if (bVar == null || bVar.f59597h) {
            return true;
        }
        return bVar.f59598i == null;
    }

    /* renamed from: d */
    public void mo32802d(C88912b bVar) {
        boolean z;
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "prepareDecode", (Object[]) null);
        if (bVar == null) {
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "param is null", (Object[]) null);
        } else if (TextUtils.isEmpty(bVar.f256416a)) {
            Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "audioId is empty!", (Object[]) null);
        } else {
            if (!this.f59593e.contains(bVar.f256416a)) {
                synchronized (this.f59594f) {
                    this.f59593e.add(bVar.f256416a);
                }
                this.f59591c.put(bVar.f256416a, bVar);
                z = false;
            } else {
                if (this.f59591c.get(bVar.f256416a).mo123301a(bVar)) {
                    Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "is same param", (Object[]) null);
                    z = false;
                } else {
                    Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "force to decode", (Object[]) null);
                    z = true;
                }
                this.f59591c.put(bVar.f256416a, bVar);
            }
            Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "ids:%d, id2ParamMap:%d", Integer.valueOf(this.f59593e.size()), Integer.valueOf(this.f59591c.size()));
            if (bVar.f256414A) {
                boolean a = mo32799a(bVar.f256416a, z, true);
                synchronized (this.f59594f) {
                    if (a) {
                        if (!((ArrayList) this.f59592d).contains(bVar.f256418c)) {
                            ((ArrayList) this.f59592d).add(bVar.f256418c);
                        }
                    }
                }
            } else if (bVar.f256422g) {
                mo32799a(bVar.f256416a, z, false);
            } else {
                boolean a2 = mo32799a(bVar.f256416a, z, true);
                synchronized (this.f59594f) {
                    if (a2) {
                        if (!((ArrayList) this.f59592d).contains(bVar.f256418c)) {
                            ((ArrayList) this.f59592d).add(bVar.f256418c);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo32803e(String str, int i) {
        C88912b bVar = this.f59591c.get(str);
        if (bVar == null) {
            Object[] objArr = {str};
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", objArr);
            return false;
        }
        bVar.f256419d = i;
        return true;
    }

    /* renamed from: f */
    public boolean mo32804f(String str, int i) {
        if (!mo32803e(str, i)) {
            return false;
        }
        mo32803e(str, i);
        C21078b bVar = this.f59590b.get(str);
        if (bVar == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", (Object[]) null);
            return false;
        } else if (bVar.f59597h) {
            int i3 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", (Object[]) null);
            return false;
        } else {
            C21090n nVar = bVar.f59598i;
            if (nVar == null) {
                int i4 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!", (Object[]) null);
                return false;
            }
            if (nVar != null) {
                nVar.seek(i);
            }
            return true;
        }
    }

    /* renamed from: g */
    public void mo32805g(String str) {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "stopDecode audioId:%s", str);
        C21078b bVar = this.f59590b.get(str);
        if (bVar == null) {
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist", (Object[]) null);
        } else if (bVar.f59597h) {
            Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!", (Object[]) null);
        } else {
            C21090n nVar = bVar.f59598i;
            if (nVar != null) {
                ((C21079c) nVar).mo32830v();
                bVar.f59598i = null;
                this.f59590b.remove(str);
            }
        }
    }
}
