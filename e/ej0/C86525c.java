package ej0;

import android.text.TextUtils;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.xweb.file.XVFSFile;
import dj0.C86331g;
import dj0.C86334j;
import dj0.C86336l;
import dj0.C86337m;
import dj0.C86338n;
import fj0.C86879h;
import fj0.C86880i;
import fj0.C86881j;
import fj0.C86882k;
import fj0.C86883l;
import fj0.C86897p;
import fj0.C86898q;
import fj0.C86907u;
import gj0.C87227a;
import gj0.C87228b;
import gj0.C87229c;
import hj0.C87531a;
import hj0.C87533c;
import hj0.C87534d;
import hj0.C87535e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: ej0.c */
public class C86525c implements C87228b {

    /* renamed from: a */
    public C86524b f251382a;

    /* renamed from: b */
    public C86898q f251383b = C86898q.C59104e.f169066a;

    /* renamed from: c */
    public C86531f f251384c;

    /* renamed from: d */
    public C86531f f251385d;

    /* renamed from: e */
    public C58608e f251386e = new C58608e();

    /* renamed from: f */
    public C87533c f251387f;

    /* renamed from: g */
    public C87533c f251388g;

    /* renamed from: h */
    public C86530d f251389h;

    /* renamed from: i */
    public boolean f251390i = false;

    /* renamed from: j */
    public boolean f251391j = false;

    /* renamed from: ej0.c$a */
    public class C86526a implements C87229c {
        public C86526a() {
        }

        /* renamed from: a */
        public void mo121010a(C87535e eVar) {
            if (eVar != null && C86525c.this.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }

        /* renamed from: b */
        public void mo121011b(C87533c cVar) {
            C86525c cVar2 = C86525c.this;
            cVar2.f251390i = true;
            cVar2.f251387f = cVar;
            if (cVar2.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }
    }

    /* renamed from: ej0.c$b */
    public class C86527b implements C87229c {
        public C86527b() {
        }

        /* renamed from: a */
        public void mo121010a(C87535e eVar) {
            if (eVar != null && C86525c.this.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }

        /* renamed from: b */
        public void mo121011b(C87533c cVar) {
            C86525c cVar2 = C86525c.this;
            cVar2.f251391j = true;
            cVar2.f251388g = cVar;
            if (cVar2.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }
    }

    /* renamed from: ej0.c$c */
    public class C86528c implements C87227a {
        public C86528c() {
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            if (eVar != null && C86525c.this.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C86525c cVar = C86525c.this;
            cVar.f251390i = false;
            cVar.f251387f = null;
            if (cVar.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }
    }

    /* renamed from: ej0.c$d */
    public class C86529d implements C87227a {
        public C86529d() {
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            if (eVar != null && C86525c.this.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C86525c cVar = C86525c.this;
            cVar.f251391j = false;
            cVar.f251388g = null;
            if (cVar.f251382a != null) {
                String str = C86525c.this.f251382a.f251378g;
            }
        }
    }

    public C86525c(C86524b bVar) {
        int i = C86898q.f252215h;
        this.f251382a = bVar;
        if (bVar != null && bVar.f251381j.size() != 0) {
            Iterator<C86531f> it = this.f251382a.f251381j.iterator();
            while (it.hasNext()) {
                C86531f next = it.next();
                if (!TextUtils.isEmpty(next.f251396a)) {
                    if (next.f251396a.startsWith("urn:schemas-upnp-org:service:AVTransport")) {
                        this.f251384c = next;
                    } else if (next.f251396a.startsWith("urn:schemas-upnp-org:service:RenderingControl")) {
                        this.f251385d = next;
                    } else {
                        next.f251396a.startsWith("urn:schemas-upnp-org:service:ConnectionManager");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo120999a(C86531f fVar) {
        C86524b bVar = this.f251382a;
        return bVar != null ? C86897p.m107912a(bVar.f251373b, bVar.f251374c, fVar.f251399d) : "";
    }

    /* renamed from: b */
    public boolean mo121000b(C87534d dVar) {
        String str;
        if (this.f251389h == null) {
            return true;
        }
        Map<String, C87531a> map = dVar.f253594b;
        if (map != null && !((HashMap) map).containsKey("LastChange")) {
            return false;
        }
        Map<String, C87531a> map2 = dVar.f253594b;
        HashMap<String, C87531a> hashMap = null;
        if (map2 != null) {
            C87531a aVar = (C87531a) ((HashMap) map2).get("LastChange");
            Objects.requireNonNull(aVar);
            str = aVar.f253586a;
        } else {
            str = null;
        }
        if (str != null) {
            hashMap = new C86907u().mo121357b(str);
        }
        if (hashMap == null) {
            return false;
        }
        if ("avtEvent".equals(dVar.f253591c)) {
            C87531a aVar2 = hashMap.get("TransportState");
            if (aVar2 != null) {
                String a = aVar2.f253587b.mo122001a(TPReportParams.JSON_KEY_VAL);
                if ("PLAYING".equalsIgnoreCase(a)) {
                    this.f251389h.mo80109b(this);
                } else if ("PAUSED_PLAYBACK".equalsIgnoreCase(a)) {
                    this.f251389h.mo80110c(this);
                } else if ("STOPPED".equalsIgnoreCase(a)) {
                    this.f251389h.mo80111d(this);
                }
            }
            C87531a aVar3 = hashMap.get("CurrentTrackDuration");
            if (aVar3 != null) {
                String[] split = aVar3.f253587b.mo122001a(TPReportParams.JSON_KEY_VAL).split(XVFSFile.PATH_SEPARATOR);
                if (split.length == 3) {
                    this.f251389h.mo80113f(this, (Integer.parseInt(split[0]) * 3600) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]));
                }
            }
        } else if ("rdcEvent".equals(dVar.f253591c)) {
            C87531a aVar4 = hashMap.get("Volume");
            if (aVar4 != null) {
                this.f251389h.mo80112e(this, Integer.parseInt(aVar4.f253587b.mo122001a(TPReportParams.JSON_KEY_VAL)));
            }
            C87531a aVar5 = hashMap.get("Mute");
            if (aVar5 != null) {
                this.f251389h.mo80108a(this, !"0".equals(aVar5.f253587b.mo122001a(TPReportParams.JSON_KEY_VAL)));
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo121001c(C87227a aVar) {
        C86531f fVar = this.f251384c;
        if (fVar != null) {
            this.f251383b.mo121351g(new C86331g(mo120999a(fVar), this.f251384c.f251396a), aVar);
        }
    }

    /* renamed from: d */
    public void mo121002d(String str, C87227a aVar) {
        C86531f fVar = this.f251384c;
        if (fVar != null) {
            this.f251383b.mo121351g(new C86334j(mo120999a(fVar), this.f251384c.f251396a, str), aVar);
        }
    }

    /* renamed from: e */
    public void mo121003e(C87227a aVar) {
        C86531f fVar = this.f251384c;
        if (fVar != null) {
            this.f251383b.mo121351g(new C86336l(mo120999a(fVar), this.f251384c.f251396a), aVar);
        }
    }

    public boolean equals(Object obj) {
        C86524b bVar = this.f251382a;
        if (bVar == null && obj == null) {
            return true;
        }
        if (bVar == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C86525c) {
            return bVar.equals(((C86525c) obj).f251382a);
        }
        return false;
    }

    /* renamed from: f */
    public void mo121005f() {
        if (!this.f251390i) {
            C86883l lVar = C86883l.C86886c.f252190a;
            C86526a aVar = new C86526a();
            lVar.getClass();
            C86531f fVar = this.f251384c;
            if (fVar != null) {
                String c = lVar.mo121338c("/upnp/cb/AVTransport");
                C86524b bVar = this.f251382a;
                C86337m mVar = new C86337m(C86897p.m107912a(bVar.f251373b, bVar.f251374c, fVar.f251400e), c);
                int i = C86898q.f252215h;
                C86898q.C59104e.f169066a.mo121351g(mVar, new C86879h(lVar, this, aVar));
            }
        }
    }

    /* renamed from: g */
    public void mo121006g() {
        if (!this.f251391j) {
            C86883l lVar = C86883l.C86886c.f252190a;
            C86527b bVar = new C86527b();
            lVar.getClass();
            C86531f fVar = this.f251385d;
            if (fVar != null) {
                String c = lVar.mo121338c("/upnp/cb/RenderControl");
                C86524b bVar2 = this.f251382a;
                C86337m mVar = new C86337m(C86897p.m107912a(bVar2.f251373b, bVar2.f251374c, fVar.f251400e), c);
                int i = C86898q.f252215h;
                C86898q.C59104e.f169066a.mo121351g(mVar, new C86880i(lVar, this, bVar));
            }
        }
    }

    /* renamed from: h */
    public void mo121007h() {
        if (this.f251390i) {
            C86883l lVar = C86883l.C86886c.f252190a;
            C86528c cVar = new C86528c();
            lVar.getClass();
            C86531f fVar = this.f251384c;
            C87533c cVar2 = this.f251387f;
            if (fVar != null && cVar2 != null && cVar2.f253589a != null) {
                C86524b bVar = this.f251382a;
                C86338n nVar = new C86338n(C86897p.m107912a(bVar.f251373b, bVar.f251374c, fVar.f251400e), cVar2.f253589a);
                int i = C86898q.f252215h;
                C86898q.C59104e.f169066a.mo121351g(nVar, new C86881j(lVar, cVar2, cVar));
            }
        }
    }

    /* renamed from: i */
    public void mo121008i() {
        if (this.f251391j) {
            C86883l lVar = C86883l.C86886c.f252190a;
            C86529d dVar = new C86529d();
            lVar.getClass();
            C86531f fVar = this.f251385d;
            C87533c cVar = this.f251388g;
            if (fVar != null && cVar != null && cVar.f253589a != null) {
                C86524b bVar = this.f251382a;
                C86338n nVar = new C86338n(C86897p.m107912a(bVar.f251373b, bVar.f251374c, fVar.f251400e), cVar.f253589a);
                int i = C86898q.f252215h;
                C86898q.C59104e.f169066a.mo121351g(nVar, new C86882k(lVar, cVar, dVar));
            }
        }
    }

    public String toString() {
        return "MRDevice{mDevice=" + this.f251382a + '}';
    }
}
