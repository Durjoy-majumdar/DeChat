package kq3;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kq3.b */
public final class C99166b implements RecyclerView.C16622o {

    /* renamed from: E */
    public static final C99167a f290778E = new C99167a((C8480h) null);

    /* renamed from: F */
    public static final boolean f290779F = Log.isDebug();

    /* renamed from: A */
    public boolean f290780A;

    /* renamed from: B */
    public int f290781B;

    /* renamed from: C */
    public boolean f290782C;

    /* renamed from: D */
    public C99168b f290783D;

    /* renamed from: d */
    public final C61143a f290784d;

    /* renamed from: e */
    public final Handler f290785e = new Handler();

    /* renamed from: f */
    public final C99169c f290786f = new C99169c(this);

    /* renamed from: g */
    public int f290787g;

    /* renamed from: h */
    public int f290788h;

    /* renamed from: i */
    public int f290789i;

    /* renamed from: j */
    public int f290790j;

    /* renamed from: n */
    public C33975e f290791n;

    /* renamed from: o */
    public RecyclerView f290792o;

    /* renamed from: p */
    public int f290793p;

    /* renamed from: q */
    public int f290794q;

    /* renamed from: r */
    public boolean f290795r;

    /* renamed from: s */
    public boolean f290796s;

    /* renamed from: t */
    public int f290797t;

    /* renamed from: u */
    public int f290798u;

    /* renamed from: v */
    public int f290799v;

    /* renamed from: w */
    public int f290800w;

    /* renamed from: x */
    public int f290801x;

    /* renamed from: y */
    public int f290802y;

    /* renamed from: z */
    public boolean f290803z;

    /* renamed from: kq3.b$a */
    public static final class C99167a {
        public C99167a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m129188a(C99167a aVar, String str) {
            aVar.getClass();
            if (C99166b.f290779F) {
                Log.m105918d("DragSelectTL", str);
            }
        }
    }

    /* renamed from: kq3.b$b */
    public static final class C99168b {

        /* renamed from: a */
        public float f290804a;

        /* renamed from: b */
        public float f290805b;

        public C99168b(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            this.f290804a = motionEvent.getX();
            this.f290805b = motionEvent.getY();
        }
    }

    public C99166b(Context context, C61143a aVar, C8480h hVar) {
        this.f290784d = aVar;
        this.f290787g = context.getResources().getDimensionPixelSize(C0966R.dimen.f3907ik);
        this.f290790j = (int) ((((float) ((int) (((double) context.getResources().getDimensionPixelSize(C0966R.dimen.f3902ic)) * 2.5d))) / ((float) 1000)) * ((float) 25));
        this.f290791n = C33975e.RANGE;
        this.f290793p = -1;
    }

    /* renamed from: a */
    public final void mo138533a(boolean z) {
        if (this.f290782C != z) {
            C99167a.m129188a(f290778E, z ? "Auto scrolling is active" : "Auto scrolling is inactive");
            this.f290782C = z;
        }
    }

    /* renamed from: b */
    public final void mo138534b() {
        this.f290795r = false;
        this.f290803z = false;
        this.f290780A = false;
        this.f290785e.removeCallbacks(this.f290786f);
        mo138533a(false);
        this.f290783D = null;
    }

    /* renamed from: c */
    public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(recyclerView, "view");
        C87412m.m108594g(motionEvent, "event");
        if (this.f290796s) {
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        int action = motionEvent.getAction();
        Rect rect = C99170d.f290807a;
        int a = C99170d.m129189a(recyclerView, motionEvent.getX(), motionEvent.getY());
        float y = motionEvent.getY();
        if (action != 1) {
            if (action == 2) {
                if (this.f290787g > -1) {
                    if (y >= ((float) this.f290799v) && y <= ((float) this.f290800w)) {
                        this.f290780A = false;
                        if (!this.f290803z) {
                            this.f290803z = true;
                            C99167a.m129188a(f290778E, "Now in TOP hotspot");
                            this.f290785e.removeCallbacks(this.f290786f);
                            this.f290785e.postDelayed(this.f290786f, 25);
                            mo138533a(true);
                        }
                        this.f290781B = this.f290790j;
                        C99167a aVar = f290778E;
                        C99167a.m129188a(aVar, "Auto scroll velocity = " + this.f290781B);
                    } else if (y >= ((float) this.f290801x) && y <= ((float) this.f290802y)) {
                        this.f290803z = false;
                        if (!this.f290780A) {
                            this.f290780A = true;
                            C99167a.m129188a(f290778E, "Now in BOTTOM hotspot");
                            this.f290785e.removeCallbacks(this.f290786f);
                            this.f290785e.postDelayed(this.f290786f, 25);
                            mo138533a(true);
                        }
                        this.f290781B = this.f290790j;
                        C99167a aVar2 = f290778E;
                        C99167a.m129188a(aVar2, "Auto scroll velocity = " + this.f290781B);
                    } else if (this.f290803z || this.f290780A) {
                        C99167a.m129188a(f290778E, "Left the hotspot");
                        this.f290785e.removeCallbacks(this.f290786f);
                        mo138533a(false);
                        this.f290803z = false;
                        this.f290780A = false;
                    }
                }
                mo138535f(a);
                if (a != -1) {
                    C99168b bVar = this.f290783D;
                    if (bVar != null) {
                        bVar.f290804a = motionEvent.getX();
                        bVar.f290805b = motionEvent.getY();
                    } else {
                        bVar = new C99168b(motionEvent);
                    }
                    this.f290783D = bVar;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        mo138534b();
        C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        C87412m.m108594g(recyclerView, "view");
        C87412m.m108594g(motionEvent, "event");
        this.f290796s = false;
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        boolean z = this.f290795r && !((adapter != null ? adapter.getItemCount() : 0) == 0);
        if (z) {
            this.f290792o = recyclerView;
            C99167a aVar = f290778E;
            C99167a.m129188a(aVar, "RecyclerView height = " + recyclerView.getMeasuredHeight());
            int i = this.f290787g;
            if (i > -1) {
                this.f290799v = 0;
                this.f290800w = i + 0;
                this.f290801x = (recyclerView.getMeasuredHeight() - this.f290787g) - 0;
                int measuredHeight = recyclerView.getMeasuredHeight() - 0;
                this.f290802y = measuredHeight;
                int i2 = this.f290788h;
                if (i2 != 0) {
                    this.f290799v += i2;
                }
                int i3 = this.f290789i;
                if (i3 != 0) {
                    this.f290802y = measuredHeight + i3;
                }
                C99167a.m129188a(aVar, "Hotspot top bound = " + this.f290799v + " to " + this.f290800w);
                C99167a.m129188a(aVar, "Hotspot bottom bound = " + this.f290801x + " to " + this.f290802y);
            }
        }
        if (z && motionEvent.getAction() == 1) {
            mo138534b();
        }
        return z;
    }

    /* renamed from: f */
    public final void mo138535f(int i) {
        int i2;
        int i3;
        System.currentTimeMillis();
        C33975e eVar = this.f290791n;
        if (eVar != C33975e.PATH || i == -1) {
            if (eVar == C33975e.RANGE && i != -1 && this.f290793p != i) {
                this.f290793p = i;
                if (this.f290797t == -1) {
                    this.f290797t = i;
                }
                if (this.f290798u == -1) {
                    this.f290798u = i;
                }
                if (i > this.f290798u) {
                    this.f290798u = i;
                }
                if (i < this.f290797t) {
                    this.f290797t = i;
                }
                int i4 = this.f290794q;
                int i5 = this.f290797t;
                int i6 = this.f290798u;
                C61143a aVar = this.f290784d;
                if (i4 == i) {
                    if (i5 <= i6) {
                        while (true) {
                            if (i5 != i4) {
                                ((C94049a.C56815a) aVar).mo80226a(i5, false);
                            }
                            if (i5 == i6) {
                                break;
                            }
                            i5++;
                        }
                    }
                } else if (i < i4) {
                    if (i <= i4) {
                        int i7 = i4;
                        while (true) {
                            ((C94049a.C56815a) aVar).mo80226a(i7, true);
                            if (i7 == i) {
                                break;
                            }
                            i7--;
                        }
                    }
                    if (i5 > -1 && i5 < i) {
                        while (i5 < i) {
                            if (i5 != i4) {
                                ((C94049a.C56815a) aVar).mo80226a(i5, false);
                            }
                            i5++;
                        }
                    }
                    if (i6 > -1 && (i3 = i4 + 1) <= i6) {
                        while (true) {
                            ((C94049a.C56815a) aVar).mo80226a(i3, false);
                            if (i3 == i6) {
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (i4 <= i) {
                        int i8 = i4;
                        while (true) {
                            ((C94049a.C56815a) aVar).mo80226a(i8, true);
                            if (i8 == i) {
                                break;
                            }
                            i8++;
                        }
                    }
                    if (i6 > -1 && i6 > i && (i2 = i + 1) <= i6) {
                        while (true) {
                            if (i2 != i4) {
                                ((C94049a.C56815a) aVar).mo80226a(i2, false);
                            }
                            if (i2 == i6) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (i5 > -1) {
                        while (i5 < i4) {
                            ((C94049a.C56815a) aVar).mo80226a(i5, false);
                            i5++;
                        }
                    }
                }
                int i9 = this.f290794q;
                int i15 = this.f290793p;
                if (i9 == i15) {
                    this.f290797t = i15;
                    this.f290798u = i15;
                }
            }
        } else if (this.f290793p != i) {
            this.f290793p = i;
            C94049a.C56815a aVar2 = (C94049a.C56815a) this.f290784d;
            C94049a aVar3 = C94049a.this;
            boolean contains = aVar3.f271542g.contains(aVar3.mo129050g5(i));
            if (C94049a.this.f271555w) {
                contains = !contains;
            }
            aVar2.mo80226a(i, !contains);
        }
    }
}
