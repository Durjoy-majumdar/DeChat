package p383t7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import p333e8.C20536j;
import p383t7.C22445g;
import p396x6.C22993a;
import p396x6.C22997e;
import p396x6.C23010j;

/* renamed from: t7.j */
public final class C22449j extends C22993a implements Handler.Callback {

    /* renamed from: A */
    public int f63573A;

    /* renamed from: o */
    public final Handler f63574o;

    /* renamed from: p */
    public final C22450a f63575p;

    /* renamed from: q */
    public final C22445g f63576q;

    /* renamed from: r */
    public final C23010j f63577r;

    /* renamed from: s */
    public boolean f63578s;

    /* renamed from: t */
    public boolean f63579t;

    /* renamed from: u */
    public int f63580u;

    /* renamed from: v */
    public Format f63581v;

    /* renamed from: w */
    public C22443e f63582w;

    /* renamed from: x */
    public C22447h f63583x;

    /* renamed from: y */
    public C22448i f63584y;

    /* renamed from: z */
    public C22448i f63585z;

    /* renamed from: t7.j$a */
    public interface C22450a {
        /* renamed from: d */
        void mo33471d(List<C22439a> list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22449j(C22450a aVar, Looper looper) {
        super(3);
        C22445g gVar = C22445g.f63569a;
        aVar.getClass();
        this.f63575p = aVar;
        this.f63574o = looper == null ? null : new Handler(looper, this);
        this.f63576q = gVar;
        this.f63577r = new C23010j();
    }

    /* renamed from: A */
    public final long mo35593A() {
        int i = this.f63573A;
        return (i == -1 || i >= this.f63584y.mo14897b()) ? MAlarmHandler.NEXT_FIRE_INTERVAL : this.f63584y.mo14896a(this.f63573A);
    }

    /* renamed from: B */
    public final void mo35594B() {
        this.f63583x = null;
        this.f63573A = -1;
        C22448i iVar = this.f63584y;
        if (iVar != null) {
            iVar.mo35589i();
            this.f63584y = null;
        }
        C22448i iVar2 = this.f63585z;
        if (iVar2 != null) {
            iVar2.mo35589i();
            this.f63585z = null;
        }
    }

    /* renamed from: a */
    public int mo33309a(Format format) {
        ((C22445g.C22446a) this.f63576q).getClass();
        String str = format.f45777i;
        if ("text/vtt".equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 4;
        }
        return MimeTypes.BASE_TYPE_TEXT.equals(C20536j.m22250b(format.f45777i)) ? 1 : 0;
    }

    /* renamed from: b */
    public boolean mo33310b() {
        return this.f63579t;
    }

    /* renamed from: g */
    public void mo33311g(long j, long j2) {
        boolean z;
        if (!this.f63579t) {
            if (this.f63585z == null) {
                this.f63582w.mo35588b(j);
                try {
                    this.f63585z = (C22448i) this.f63582w.dequeueOutputBuffer();
                } catch (C22444f e) {
                    throw C22997e.m27212a(e, this.f66064f);
                }
            }
            if (this.f66065g == 2) {
                if (this.f63584y != null) {
                    long A = mo35593A();
                    z = false;
                    while (A <= j) {
                        this.f63573A++;
                        A = mo35593A();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C22448i iVar = this.f63585z;
                if (iVar != null) {
                    if (iVar.mo36910g(4)) {
                        if (!z && mo35593A() == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                            if (this.f63580u == 2) {
                                mo35594B();
                                this.f63582w.release();
                                this.f63582w = null;
                                this.f63580u = 0;
                                this.f63582w = ((C22445g.C22446a) this.f63576q).mo35590a(this.f63581v);
                            } else {
                                mo35594B();
                                this.f63579t = true;
                            }
                        }
                    } else if (this.f63585z.f67263e <= j) {
                        C22448i iVar2 = this.f63584y;
                        if (iVar2 != null) {
                            iVar2.mo35589i();
                        }
                        C22448i iVar3 = this.f63585z;
                        this.f63584y = iVar3;
                        this.f63585z = null;
                        this.f63573A = iVar3.mo14898c(j);
                        z = true;
                    }
                }
                if (z) {
                    List<C22439a> e2 = this.f63584y.mo14899e(j);
                    Handler handler = this.f63574o;
                    if (handler != null) {
                        handler.obtainMessage(0, e2).sendToTarget();
                    } else {
                        this.f63575p.mo33471d(e2);
                    }
                }
                if (this.f63580u != 2) {
                    while (!this.f63578s) {
                        try {
                            if (this.f63583x == null) {
                                C22447h hVar = (C22447h) this.f63582w.mo35730a();
                                this.f63583x = hVar;
                                if (hVar == null) {
                                    return;
                                }
                            }
                            if (this.f63580u == 1) {
                                C22447h hVar2 = this.f63583x;
                                hVar2.f67251d = 4;
                                this.f63582w.mo35731c(hVar2);
                                this.f63583x = null;
                                this.f63580u = 2;
                                return;
                            }
                            int z2 = mo36250z(this.f63577r, this.f63583x, false);
                            if (z2 == -4) {
                                if (this.f63583x.mo36910g(4)) {
                                    this.f63578s = true;
                                } else {
                                    C22447h hVar3 = this.f63583x;
                                    hVar3.f63570i = this.f63577r.f66173a.f45767C;
                                    hVar3.f67260f.flip();
                                }
                                this.f63582w.mo35731c(this.f63583x);
                                this.f63583x = null;
                            } else if (z2 == -3) {
                                return;
                            }
                        } catch (C22444f e3) {
                            throw C22997e.m27212a(e3, this.f66064f);
                        }
                    }
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f63575p.mo33471d((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: t */
    public void mo32386t() {
        this.f63581v = null;
        List emptyList = Collections.emptyList();
        Handler handler = this.f63574o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f63575p.mo33471d(emptyList);
        }
        mo35594B();
        this.f63582w.release();
        this.f63582w = null;
        this.f63580u = 0;
    }

    /* renamed from: v */
    public void mo32388v(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.f63574o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f63575p.mo33471d(emptyList);
        }
        this.f63578s = false;
        this.f63579t = false;
        if (this.f63580u != 0) {
            mo35594B();
            this.f63582w.release();
            this.f63582w = null;
            this.f63580u = 0;
            this.f63582w = ((C22445g.C22446a) this.f63576q).mo35590a(this.f63581v);
            return;
        }
        mo35594B();
        this.f63582w.flush();
    }

    /* renamed from: y */
    public void mo32391y(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.f63581v = format;
        if (this.f63582w != null) {
            this.f63580u = 1;
        } else {
            this.f63582w = ((C22445g.C22446a) this.f63576q).mo35590a(format);
        }
    }
}
