package gr2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gr2.d */
public class C98189d implements C98184b {

    /* renamed from: a */
    public C98191f f287876a;

    /* renamed from: b */
    public ViewGroup f287877b;

    /* renamed from: c */
    public Point f287878c = new Point();

    /* renamed from: d */
    public C98183a f287879d;

    /* renamed from: e */
    public C98185c f287880e;

    /* renamed from: f */
    public Point f287881f;

    /* renamed from: g */
    public Rect f287882g;

    /* renamed from: h */
    public int f287883h;

    public C98189d(Context context, FrameLayout frameLayout, C98183a aVar, int i) {
        this.f287876a = new C98191f(context, frameLayout);
        this.f287877b = frameLayout;
        this.f287879d = aVar;
        this.f287883h = i;
    }

    /* renamed from: a */
    public void mo137488a(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("handleTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
        if (motionEvent == null) {
            SnsMethodCalculate.markEndTimeMs("handleTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
            return;
        }
        try {
            Log.m105918d("ParticleAnimProxy", "handleTouchEvent:" + motionEvent.getAction());
            C98183a aVar = this.f287879d;
            if (aVar != null) {
                if (this.f287881f == null || this.f287883h == 2) {
                    this.f287881f = aVar.mo137483b();
                }
                if (this.f287882g == null || this.f287883h == 2) {
                    this.f287882g = this.f287879d.mo137482a();
                }
            }
            int x = ((int) motionEvent.getX()) + this.f287881f.x;
            int y = ((int) motionEvent.getY()) + this.f287881f.y;
            this.f287878c.set(x, y);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        Rect rect = this.f287882g;
                        if (rect == null) {
                            this.f287876a.mo137490a(this.f287878c);
                        } else if (rect.contains(x, y)) {
                            this.f287876a.mo137490a(this.f287878c);
                        } else {
                            this.f287876a.mo137496h();
                        }
                    } else if (action != 3) {
                    }
                }
                Log.m105918d("ParticleAnimProxy", "action up");
                Rect rect2 = this.f287882g;
                if (rect2 == null || rect2.contains(x, y)) {
                    this.f287876a.mo137490a(this.f287878c);
                }
                this.f287876a.mo137496h();
                this.f287882g = null;
                this.f287881f = null;
            } else {
                this.f287876a.mo137496h();
            }
        } catch (Throwable th) {
            Log.m105920e("ParticleAnimProxy", "handleTouchEvent, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("handleTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
    }

    /* renamed from: b */
    public void mo137489b(C98185c cVar) {
        SnsMethodCalculate.markStartTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
        try {
            if (this.f287880e != cVar) {
                Log.m105924i("ParticleAnimProxy", "setAnimConfig, old=" + this.f287880e);
                Log.m105924i("ParticleAnimProxy", "setAnimConfig, new=" + cVar);
                C98191f fVar = this.f287876a;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                Log.m105924i("ParticleGenerator", "clear");
                fVar.f287890b.clear();
                fVar.f287891c.clear();
                SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
                this.f287877b.removeAllViews();
                if (cVar != null) {
                    this.f287876a.mo137498j(cVar);
                    this.f287877b.setVisibility(0);
                } else {
                    this.f287877b.setVisibility(8);
                }
                this.f287880e = cVar;
            } else {
                Log.m105924i("ParticleAnimProxy", "setAnimConfig, config not change");
            }
        } catch (Throwable th) {
            Log.m105920e("ParticleAnimProxy", "setAnimConfig, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setAnimConfig", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimProxy");
    }
}
