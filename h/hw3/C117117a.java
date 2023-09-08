package hw3;

import android.graphics.Rect;
import android.view.MotionEvent;
import bw3.C113215b;
import cw3.C116544b;
import gw3.C117005i;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import rv3.C118245h;
import vv3.C118702d;

/* renamed from: hw3.a */
public abstract class C117117a implements C113215b.C113218c {

    /* renamed from: a */
    public C118702d f350911a;

    /* renamed from: b */
    public C116544b f350912b;

    /* renamed from: c */
    public Rect f350913c = new Rect();

    /* renamed from: d */
    public Set<Integer> f350914d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public C117118b f350915e;

    public C117117a(C118702d dVar, C116544b bVar) {
        this.f350911a = dVar;
        this.f350912b = bVar;
    }

    /* renamed from: a */
    public C117005i mo181056a(int i, long j, float f, float f2) {
        C117005i iVar = new C117005i();
        iVar.f350643d = i;
        iVar.f350646g = j;
        C118245h.m166799a("sensor_AbsTouch", "[method: buildTouchInfo ] touchTimestamp : " + iVar.f350646g);
        iVar.f350647h = f;
        iVar.f350648i = f2;
        return iVar;
    }

    /* renamed from: b */
    public abstract void mo181057b(MotionEvent motionEvent, C113215b.C113217b bVar);
}
