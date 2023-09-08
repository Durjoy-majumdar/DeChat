package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113820hz;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114105qf;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.pc */
public final class C114036pc extends C114027oy<C113523ar> implements C113523ar {

    /* renamed from: A */
    private final int f341164A = 12;

    /* renamed from: B */
    private C113820hz f341165B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public float f341166C;

    /* renamed from: D */
    private C114040a f341167D = null;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f341168E = 1.0f;

    /* renamed from: F */
    private int f341169F = 0;

    /* renamed from: G */
    private PolylineOptions.Text f341170G;

    /* renamed from: H */
    private boolean f341171H = false;

    /* renamed from: I */
    private boolean f341172I = true;

    /* renamed from: J */
    private float f341173J = 0.0f;

    /* renamed from: K */
    private boolean f341174K = false;

    /* renamed from: L */
    private boolean f341175L = false;

    /* renamed from: M */
    private int f341176M = -1;

    /* renamed from: N */
    private GeoPoint f341177N = null;

    /* renamed from: O */
    private String f341178O;

    /* renamed from: P */
    private int f341179P = ((int) (C113801hf.m157135a(this.f341071l.mo171543G()) * 100.0f));

    /* renamed from: Q */
    private List<Integer> f341180Q;

    /* renamed from: R */
    private final float f341181R;

    /* renamed from: S */
    private boolean f341182S;

    /* renamed from: T */
    private Animation f341183T;

    /* renamed from: U */
    private PolylineOptions f341184U;

    /* renamed from: V */
    private List<LatLng> f341185V;

    /* renamed from: W */
    private final C113532ba f341186W;

    /* renamed from: X */
    private String f341187X = C114342tg.f342673a;

    /* renamed from: Y */
    private boolean f341188Y;

    /* renamed from: Z */
    private C113820hz.C113822b f341189Z = new C113820hz.C113822b() {
        /* renamed from: a */
        public final void mo172208a(float f) {
            float unused = C114036pc.this.f341166C = f;
        }

        /* renamed from: a */
        public final void mo172209a(float f, float f2) {
        }

        /* renamed from: a */
        public final void mo172210a(float f, float f2, float f3, float f4) {
        }

        /* renamed from: a */
        public final void mo172211a(int i, int i2) {
        }

        /* renamed from: b */
        public final void mo172212b(float f) {
            float unused = C114036pc.this.f341168E = f;
        }
    };

    /* renamed from: a */
    public C114105qf f341190a = null;

    /* renamed from: n */
    private C114107qg f341191n = null;

    /* renamed from: o */
    private Polyline f341192o = null;

    /* renamed from: p */
    private final List<C114040a> f341193p;

    /* renamed from: q */
    private final List<GeoPoint> f341194q;

    /* renamed from: r */
    private float f341195r;

    /* renamed from: s */
    private final C113961mq f341196s;

    /* renamed from: t */
    private boolean f341197t = false;

    /* renamed from: u */
    private int[] f341198u = null;

    /* renamed from: v */
    private int[] f341199v = null;

    /* renamed from: w */
    private int[] f341200w = null;

    /* renamed from: x */
    private int f341201x = -7829368;

    /* renamed from: y */
    private PolylineOptions.ColorType f341202y;

    /* renamed from: z */
    private BitmapDescriptor f341203z = null;

    /* renamed from: com.tencent.mapsdk.internal.pc$b */
    public static class C114041b {

        /* renamed from: a */
        public int[] f341209a;

        /* renamed from: b */
        public int[] f341210b;

        /* renamed from: c */
        public int f341211c;

        /* renamed from: d */
        public int f341212d;

        public C114041b(int i) {
            this.f341212d = i;
            this.f341209a = new int[i];
            this.f341210b = new int[i];
        }

        /* renamed from: a */
        public final void mo172629a(int i, int i2) {
            int i3 = this.f341211c;
            if (i3 < this.f341212d) {
                this.f341209a[i3] = i;
                this.f341210b[i3] = i2;
                this.f341211c = i3 + 1;
            }
        }
    }

    public C114036pc(C113532ba baVar) {
        super(baVar);
        this.f341186W = baVar;
        C113961mq b = baVar.mo171576b();
        this.f341196s = b;
        this.f341193p = new CopyOnWriteArrayList();
        this.f341194q = new CopyOnWriteArrayList();
        this.f341181R = b.getContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private static int m158687b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return (i == 6 || i != 33) ? 6 : 33;
        }
        return 4;
    }

    /* renamed from: c */
    private static int m158690c(int i) {
        if (i >= 12) {
            i = 11;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: c */
    private C114041b m158691c(List<GeoPoint> list) {
        int[] iArr;
        int[] iArr2 = this.f341198u;
        if (iArr2 == null || (iArr = this.f341199v) == null || list == null || iArr2.length == 0 || iArr.length == 0 || list.isEmpty()) {
            int i = this.f341065f;
            if (this.f341202y == PolylineOptions.ColorType.LINE_COLOR_TEXTURE) {
                i = m158690c(i);
            }
            C114041b bVar = new C114041b(1);
            bVar.mo172629a(0, i);
            return bVar;
        }
        TreeSet treeSet = new TreeSet(new Comparator<Integer>() {
            /* renamed from: a */
            private static int m158718a(Integer num, Integer num2) {
                return num.compareTo(num2);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Integer) obj).compareTo((Integer) obj2);
            }
        });
        for (int i2 : this.f341199v) {
            if (i2 >= 0 && i2 < list.size()) {
                treeSet.add(Integer.valueOf(i2));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int valueOf : this.f341198u) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Integer[] numArr = (Integer[]) treeSet.toArray(new Integer[0]);
        if (numArr[0].intValue() != 0) {
            treeSet.add(0);
            arrayList.add(0, Integer.valueOf(this.f341198u[0]));
        }
        if (numArr[numArr.length - 1].intValue() != list.size() - 1) {
            treeSet.add(Integer.valueOf(list.size() - 1));
            if (numArr.length > this.f341198u.length) {
                int[] iArr3 = this.f341198u;
                arrayList.add(arrayList.size() - 1, Integer.valueOf(iArr3[iArr3.length - 1]));
            }
        }
        ArrayList arrayList2 = new ArrayList(treeSet);
        int size = arrayList2.size();
        C114041b bVar2 = new C114041b(size);
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > arrayList.size() - 1) {
                bVar2.mo172629a(((Integer) arrayList2.get(i3)).intValue(), ((Integer) arrayList.get(arrayList.size() - 1)).intValue());
            } else {
                bVar2.mo172629a(((Integer) arrayList2.get(i3)).intValue(), ((Integer) arrayList.get(i3)).intValue());
            }
        }
        return bVar2;
    }

    /* renamed from: d */
    private void m158693d() {
        if (Thread.currentThread().getName().contains(this.f341187X)) {
            m158695e();
        } else {
            this.f341196s.mo172432a((C113961mq.C113963a) new C113961mq.C113963a() {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    C114036pc.this.m158695e();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m158695e() {
        if (this.f341196s != null && this.f341194q.size() >= 2 && isVisible()) {
            C114105qf qfVar = this.f341190a;
            C113736fs g = m158697g();
            if (g.mo172102a()) {
                if (qfVar == null) {
                    qfVar = new C114105qf(this, this.f341186W, g);
                    qfVar.f341062c_ = this.f341062c_;
                    this.f341196s.f340903k.mo171684a((C113709et) qfVar);
                    this.f341190a = qfVar;
                } else {
                    qfVar.mo172712a(g);
                }
                qfVar.mo172711a(this.f341176M, this.f341177N);
                this.f341196s.f340914v = true;
            }
        }
    }

    /* renamed from: f */
    private void m158696f() {
        int i;
        C114107qg qgVar;
        C113961mq mqVar = this.f341196s;
        if (mqVar != null && this.f341182S) {
            this.f341182S = false;
            PolylineOptions.Text text = this.f341170G;
            if (text != null || (qgVar = this.f341191n) == null) {
                C114216sq sqVar = mqVar.f340899g;
                if (text != null) {
                    C114107qg qgVar2 = this.f341191n;
                    if (qgVar2 == null) {
                        List<GeoPoint> list = this.f341194q;
                        if (list != null && list.size() >= 2) {
                            List<GeoPoint> list2 = this.f341194q;
                            this.f341191n = new C114107qg(sqVar, (GeoPoint[]) list2.toArray(new GeoPoint[list2.size()]), this.f341170G);
                            return;
                        }
                        return;
                    }
                    C114216sq sqVar2 = qgVar2.f341525b;
                    if (sqVar2 != null && (i = qgVar2.f341524a) > 0) {
                        sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i, text) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                if (C114216sq.this.f342024e != 0) {
                                    C114216sq.this.f342023d.setLineTextStyle(C114216sq.this.f342024e, r2, r3);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            qgVar.mo172713a();
            this.f341191n = null;
        }
    }

    /* renamed from: g */
    private C113736fs m158697g() {
        C113736fs fsVar = new C113736fs();
        if (this.f341196s == null) {
            return fsVar;
        }
        BitmapDescriptor bitmapDescriptor = this.f341203z;
        if (!(bitmapDescriptor == null || bitmapDescriptor.getFormater() == null)) {
            fsVar.f340283y = this.f341203z.getFormater().getBitmapId();
        }
        C114041b c = m158691c(this.f341194q);
        fsVar.f340281w = this.f341197t;
        fsVar.f340263I = (float) this.f341179P;
        fsVar.mo172099a(this.f341194q);
        fsVar.f340268N = this.f341201x;
        if (this.f341169F == 0) {
            int a = m158675a(this.f341196s.getContext(), this.f341203z);
            if (a > 0) {
                float f = this.f341063d;
                float f2 = (float) a;
                if (f > f2) {
                    f = f2;
                }
                fsVar.f340282x = f;
            } else {
                fsVar.f340282x = this.f341063d;
            }
        } else {
            fsVar.f340282x = this.f341063d;
        }
        if (this.f341202y == PolylineOptions.ColorType.LINE_COLOR_ARGB) {
            fsVar.f340280v = true;
            float f3 = this.f341063d;
            if (this.f341195r * 2.0f >= f3) {
                this.f341195r = f3 / 3.0f;
            }
            fsVar.f340279u = this.f341195r;
        }
        int[] iArr = this.f341200w;
        if (this.f341172I) {
            fsVar.mo172100a(c.f341209a);
            if (this.f341195r <= 0.0f || iArr == null || iArr.length <= 0) {
                fsVar.mo172104b(c.f341210b);
            } else {
                fsVar.mo172101a(c.f341210b, iArr);
            }
        } else {
            fsVar.mo172100a(new int[]{0});
            if (this.f341195r <= 0.0f || iArr == null || iArr.length <= 0) {
                fsVar.mo172104b(new int[]{this.f341065f});
            } else {
                fsVar.mo172101a(new int[]{this.f341065f}, new int[]{iArr[0]});
            }
        }
        fsVar.f340255A = this.f341166C;
        fsVar.f340257C = this.f341169F;
        fsVar.f340261G = (int) this.f341066g;
        fsVar.f340258D = this.f341171H;
        fsVar.f340259E = this.f341174K;
        fsVar.f340284z = this.f341175L;
        fsVar.f340256B = this.f341172I;
        fsVar.f340262H = this.f341178O;
        fsVar.mo172103b(this.f341180Q);
        fsVar.f340267M = this.f341069j;
        fsVar.f340269O = this.f341188Y;
        return fsVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m158698h() {
        /*
            r13 = this;
            com.tencent.mapsdk.internal.mq r0 = r13.f341196s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.mapsdk.internal.hz r0 = r13.f341165B
            if (r0 == 0) goto L_0x00c9
            boolean r2 = r0.f340558d
            if (r2 == 0) goto L_0x00c9
            r0.mo172207b()
            com.tencent.mapsdk.internal.hz r0 = r13.f341165B
            boolean r2 = r0 instanceof com.tencent.mapsdk.internal.C113824ib
            r3 = 0
            if (r2 == 0) goto L_0x00b2
            java.util.List<com.tencent.map.lib.models.GeoPoint> r0 = r13.f341194q
            r0.clear()
            java.util.List<com.tencent.map.lib.models.GeoPoint> r0 = r13.f341194q
            java.util.List<com.tencent.mapsdk.internal.pc$a> r2 = r13.f341193p
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 2
            if (r2 == 0) goto L_0x00a3
            int r6 = r2.size()
            if (r6 >= r5) goto L_0x0031
            goto L_0x00a3
        L_0x0031:
            com.tencent.mapsdk.internal.pc$a r6 = r13.f341167D
            float r6 = r6.f341207a
            float r7 = r13.f341173J
            float r7 = r7 - r6
            float r8 = r13.f341168E
            float r9 = r6 * r8
            float r7 = r7 * r8
            float r8 = r6 - r9
            float r6 = r6 + r7
            r7 = r3
        L_0x0042:
            int r9 = r2.size()
            if (r1 >= r9) goto L_0x00a3
            java.lang.Object r9 = r2.get(r1)
            com.tencent.mapsdk.internal.pc$a r9 = (com.tencent.mapsdk.internal.C114036pc.C114040a) r9
            float r10 = r9.f341207a
            int r11 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0073
            int r11 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0073
            if (r7 == 0) goto L_0x006f
            float r11 = r7.f341207a
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x006f
            float r10 = r10 - r11
            float r11 = r8 - r11
            float r11 = r11 / r10
            com.tencent.mapsdk.internal.pc$a r10 = m158677a(r7, r9, r11)
            int r7 = r7.f341208b
            r10.f341208b = r7
            r4.add(r10)
        L_0x006f:
            r4.add(r9)
            goto L_0x009f
        L_0x0073:
            int r11 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x008e
            if (r7 == 0) goto L_0x00a3
            float r1 = r7.f341207a
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a3
            float r10 = r10 - r1
            float r6 = r6 - r1
            float r6 = r6 / r10
            com.tencent.mapsdk.internal.pc$a r1 = m158677a(r7, r9, r6)
            int r2 = r9.f341208b
            r1.f341208b = r2
            r4.add(r1)
            goto L_0x00a3
        L_0x008e:
            int r7 = java.lang.Float.compare(r10, r8)
            if (r7 == 0) goto L_0x009c
            float r7 = r9.f341207a
            int r7 = java.lang.Float.compare(r7, r6)
            if (r7 != 0) goto L_0x009f
        L_0x009c:
            r4.add(r9)
        L_0x009f:
            int r1 = r1 + 1
            r7 = r9
            goto L_0x0042
        L_0x00a3:
            r0.addAll(r4)
            java.util.List<com.tencent.map.lib.models.GeoPoint> r0 = r13.f341194q
            int r0 = r0.size()
            if (r0 < r5) goto L_0x00b9
            r13.m158693d()
            goto L_0x00b9
        L_0x00b2:
            boolean r0 = r0 instanceof com.tencent.mapsdk.internal.C113819hy
            if (r0 == 0) goto L_0x00b9
            r13.m158693d()
        L_0x00b9:
            com.tencent.mapsdk.internal.mq r0 = r13.f341196s
            r1 = 1
            r0.f340914v = r1
            com.tencent.mapsdk.internal.hz r0 = r13.f341165B
            boolean r2 = r0.f340559e
            if (r2 == 0) goto L_0x00c9
            r0.mo172205a((com.tencent.mapsdk.internal.C113820hz.C113822b) r3)
            r13.f341165B = r3
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114036pc.m158698h():boolean");
    }

    /* renamed from: i */
    private int[] m158699i() {
        return this.f341200w;
    }

    /* renamed from: t */
    private C113523ar m158700t() {
        return this;
    }

    /* renamed from: u */
    private Polyline m158701u() {
        return this.f341192o;
    }

    /* renamed from: v */
    private float m158702v() {
        return this.f341166C;
    }

    /* renamed from: w */
    private C114105qf m158703w() {
        return this.f341190a;
    }

    public final void addTurnArrow(int i, int i2) {
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.mo172012d();
            C114105qf qfVar2 = this.f341190a;
            C114105qf.C114106a aVar = new C114105qf.C114106a();
            qfVar2.f341514s = aVar;
            aVar.f341522a = i;
            aVar.f341523b = i2;
            qfVar2.mo172606q();
            m158693d();
        }
    }

    public final void appendPoint(LatLng... latLngArr) {
        if (this.f341185V == null) {
            this.f341185V = new ArrayList();
        }
        this.f341185V.addAll(Arrays.asList(latLngArr));
        m158685a(this.f341185V);
    }

    public final void appendPoints(List<LatLng> list) {
        if (this.f341185V == null) {
            this.f341185V = new ArrayList();
        }
        this.f341185V.addAll(list);
        m158685a(this.f341185V);
    }

    public final void arrowSpacing(int i) {
        if (this.f341179P != i) {
            this.f341179P = i;
            PolylineOptions polylineOptions = this.f341184U;
            if (polylineOptions != null) {
                polylineOptions.arrowSpacing(i);
            }
            mo172606q();
        }
    }

    public final void cleanTurnArrow() {
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.mo172012d();
            m158693d();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C114036pc)) {
            return TextUtils.equals(this.f341061b_, ((C114036pc) obj).f341061b_);
        }
        return false;
    }

    public final void eraseColor(int i) {
        if (this.f341201x != i) {
            this.f341201x = i;
            PolylineOptions polylineOptions = this.f341184U;
            if (polylineOptions != null) {
                polylineOptions.eraseColor(i);
            }
            mo172606q();
        }
    }

    public final void eraseTo(int i, LatLng latLng) {
        mo171389a(i, latLng);
    }

    /* renamed from: f_ */
    public final /* bridge */ /* synthetic */ C113521ap mo171394f_() {
        return this;
    }

    public final int getColor() {
        return getStrokeColor();
    }

    public final int[][] getColors() {
        int[] iArr;
        int[] iArr2 = this.f341198u;
        if (iArr2 == null || (iArr = this.f341199v) == null) {
            return null;
        }
        int[] iArr3 = new int[2];
        iArr3[1] = Math.max(iArr2.length, iArr.length);
        iArr3[0] = 2;
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
        iArr4[0] = this.f341198u;
        iArr4[1] = this.f341199v;
        return iArr4;
    }

    public final List<Boundable<C113707es>> getGroupBounds() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f341190a);
        return arrayList;
    }

    public final List<Integer> getPattern() {
        return this.f341180Q;
    }

    public final List<LatLng> getPoints() {
        return this.f341185V;
    }

    public final PolylineOptions getPolylineOptions() {
        return this.f341184U;
    }

    public final PolylineOptions.Text getText() {
        return this.f341170G;
    }

    public final Rect getVisibleRect() {
        int i;
        Rect rect;
        C114105qf qfVar = this.f341190a;
        ArrayList<GeoPoint> arrayList = qfVar.f341508a.f340270l;
        if (arrayList != null && !arrayList.isEmpty() && (i = qfVar.f341511p) >= 0 && i < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(qfVar.f341511p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    GeoPoint geoPoint2 = subList.get(i2);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                qfVar.f341508a.f340260F = rect;
            }
        }
        return qfVar.f341508a.f340260F;
    }

    public final float getWidth() {
        return this.f341063d;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.remove();
            this.f341190a = null;
        }
        C114107qg qgVar = this.f341191n;
        if (qgVar != null) {
            qgVar.mo172713a();
            this.f341191n = null;
        }
        List<C114040a> list = this.f341193p;
        if (list != null) {
            list.clear();
        }
        List<GeoPoint> list2 = this.f341194q;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final boolean handleOnTap() {
        return true;
    }

    public final int hashCode() {
        return this.f341061b_.hashCode();
    }

    public final boolean isAboveMaskLayer() {
        return this.f341171H;
    }

    public final boolean isGradientEnable() {
        return this.f341188Y;
    }

    /* renamed from: j */
    public final void mo172003j() {
        m158693d();
    }

    /* renamed from: j_ */
    public final void mo172596j_() {
        int i;
        C114107qg qgVar;
        C113820hz hzVar;
        this.f341187X = Thread.currentThread().getName();
        if (this.f341196s != null && isVisible()) {
            if (mo172605p()) {
                if (this.f341193p.size() >= 2) {
                    this.f341194q.clear();
                    this.f341194q.addAll(this.f341193p);
                }
                m158693d();
            }
            if (!(this.f341196s == null || (hzVar = this.f341165B) == null || !hzVar.f340558d)) {
                hzVar.mo172207b();
                C113820hz hzVar2 = this.f341165B;
                if (hzVar2 instanceof C113824ib) {
                    this.f341194q.clear();
                    List<GeoPoint> list = this.f341194q;
                    List<C114040a> list2 = this.f341193p;
                    ArrayList arrayList = new ArrayList();
                    if (list2 != null && list2.size() >= 2) {
                        float f = this.f341167D.f341207a;
                        float f2 = this.f341168E;
                        float f3 = (this.f341173J - f) * f2;
                        float f4 = f - (f * f2);
                        float f5 = f + f3;
                        C114040a aVar = null;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= list2.size()) {
                                break;
                            }
                            C114040a aVar2 = list2.get(i2);
                            float f6 = aVar2.f341207a;
                            if (f6 > f4 && f6 < f5) {
                                if (aVar != null) {
                                    float f7 = aVar.f341207a;
                                    if (f7 < f4) {
                                        C114040a a = m158677a(aVar, aVar2, (f4 - f7) / (f6 - f7));
                                        a.f341208b = aVar.f341208b;
                                        arrayList.add(a);
                                    }
                                }
                                arrayList.add(aVar2);
                            } else if (f6 > f5) {
                                if (aVar != null) {
                                    float f8 = aVar.f341207a;
                                    if (f8 < f5) {
                                        C114040a a2 = m158677a(aVar, aVar2, (f5 - f8) / (f6 - f8));
                                        a2.f341208b = aVar2.f341208b;
                                        arrayList.add(a2);
                                    }
                                }
                            } else if (Float.compare(f6, f4) == 0 || Float.compare(aVar2.f341207a, f5) == 0) {
                                arrayList.add(aVar2);
                            }
                            i2++;
                            aVar = aVar2;
                        }
                    }
                    list.addAll(arrayList);
                    if (this.f341194q.size() >= 2) {
                        m158693d();
                    }
                } else if (hzVar2 instanceof C113819hy) {
                    m158693d();
                }
                this.f341196s.f340914v = true;
                C113820hz hzVar3 = this.f341165B;
                if (hzVar3.f340559e) {
                    hzVar3.mo172205a((C113820hz.C113822b) null);
                    this.f341165B = null;
                }
            }
            C113961mq mqVar = this.f341196s;
            if (mqVar != null && this.f341182S) {
                this.f341182S = false;
                PolylineOptions.Text text = this.f341170G;
                if (text != null || (qgVar = this.f341191n) == null) {
                    C114216sq sqVar = mqVar.f340899g;
                    if (text != null) {
                        C114107qg qgVar2 = this.f341191n;
                        if (qgVar2 == null) {
                            List<GeoPoint> list3 = this.f341194q;
                            if (list3 != null && list3.size() >= 2) {
                                List<GeoPoint> list4 = this.f341194q;
                                this.f341191n = new C114107qg(sqVar, (GeoPoint[]) list4.toArray(new GeoPoint[list4.size()]), this.f341170G);
                                return;
                            }
                            return;
                        }
                        C114216sq sqVar2 = qgVar2.f341525b;
                        if (sqVar2 != null && (i = qgVar2.f341524a) > 0) {
                            sqVar2.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(i, text) {
                                /* renamed from: a */
                                public final void mo54067a(GL10 gl10) {
                                    if (C114216sq.this.f342024e != 0) {
                                        C114216sq.this.f342023d.setLineTextStyle(C114216sq.this.f342024e, r2, r3);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                qgVar.mo172713a();
                this.f341191n = null;
            }
        }
    }

    /* renamed from: l_ */
    public final Rect mo171393l_() {
        int i;
        Rect rect;
        C114105qf qfVar = this.f341190a;
        ArrayList<GeoPoint> arrayList = qfVar.f341508a.f340270l;
        if (arrayList != null && !arrayList.isEmpty() && (i = qfVar.f341511p) >= 0 && i < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(qfVar.f341511p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    GeoPoint geoPoint2 = subList.get(i2);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                qfVar.f341508a.f340260F = rect;
            }
        }
        return qfVar.f341508a.f340260F;
    }

    /* renamed from: o */
    public final void mo172021o() {
        super.mo172021o();
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.mo172021o();
        }
    }

    public final boolean onTap(float f, float f2) {
        C114105qf qfVar;
        if (this.f341196s == null || !isVisible() || (qfVar = this.f341190a) == null) {
            return false;
        }
        return qfVar.onTap(f, f2);
    }

    public final void pattern(List<Integer> list) {
        m158694d(list);
    }

    /* renamed from: q */
    public final void mo172606q() {
        super.mo172606q();
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.mo172606q();
        }
    }

    public final void setAboveMaskLayer(boolean z) {
        if (this.f341171H != z) {
            this.f341171H = z;
            mo172606q();
        }
    }

    public final void setAnimation(Animation animation) {
        if ((animation instanceof AlphaAnimation) || (animation instanceof EmergeAnimation) || (animation instanceof IAlphaAnimation) || (animation instanceof IEmergeAnimation)) {
            this.f341183T = animation;
        } else {
            C113889km.m157544b("Unsupported animation, only AlphaAnimation and EmergeAnimation allowed.");
        }
    }

    public final void setArrow(boolean z) {
        if (this.f341197t != z) {
            this.f341197t = z;
            PolylineOptions polylineOptions = this.f341184U;
            if (polylineOptions != null) {
                polylineOptions.arrow(z);
            }
            mo172606q();
        }
    }

    public final void setBorderColors(int[] iArr) {
        if (this.f341200w != iArr) {
            this.f341200w = iArr;
            PolylineOptions polylineOptions = this.f341184U;
            if (polylineOptions != null) {
                polylineOptions.borderColors(iArr);
            }
            mo172606q();
        }
    }

    public final void setColor(int i) {
        setStrokeColor(i);
        PolylineOptions polylineOptions = this.f341184U;
        if (polylineOptions != null) {
            polylineOptions.color(i);
        }
    }

    public final void setColorTexture(String str) {
        setColorTexture(BitmapDescriptorFactory.fromAsset(str));
    }

    public final void setColors(int[] iArr, int[] iArr2) {
        this.f341198u = iArr;
        this.f341199v = iArr2;
        this.f341202y = m158678a(PolylineOptions.ColorType.LINE_COLOR_NONE);
        this.f341172I = true;
        mo172606q();
    }

    public final void setEraseable(boolean z) {
        this.f341174K = z;
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.f341508a.f340259E = z;
        }
        mo172606q();
    }

    public final void setGradientEnable(boolean z) {
        if (this.f341169F == 0 && this.f341172I) {
            this.f341188Y = z;
            mo172606q();
        }
    }

    public final void setPoints(List<LatLng> list) {
        m158685a(list);
    }

    public final void setPolylineOptions(PolylineOptions polylineOptions) {
        if (this.f341196s != null && polylineOptions != null) {
            this.f341072m = true;
            this.f341184U = polylineOptions;
            if (polylineOptions.getWidth() == -1.0f) {
                setStrokeWidth(this.f341181R * 9.0f);
            } else {
                setStrokeWidth(polylineOptions.getWidth());
            }
            setStrokeColor(polylineOptions.getColor());
            setZIndex(polylineOptions.getZIndex());
            setVisible(polylineOptions.isVisible());
            this.f341166C = polylineOptions.getAlpha();
            mo172606q();
            setArrow(polylineOptions.isArrow());
            setColorTexture(polylineOptions.getColorTexture());
            m158692c(polylineOptions.getLineCap());
            m158694d(polylineOptions.getPattern());
            this.f341195r = polylineOptions.getBorderWidth();
            setClickable(polylineOptions.isClickable());
            this.f341200w = polylineOptions.getBorderColors();
            this.f341062c_ = polylineOptions.getIndoorInfo();
            this.f341169F = polylineOptions.getLineType();
            this.f341069j = polylineOptions.getLevel();
            this.f341201x = polylineOptions.getEraseColor();
            if (polylineOptions.isAbovePillar() && this.f341069j == 0) {
                this.f341069j = 2;
            }
            m158685a(polylineOptions.getPoints());
            if (polylineOptions.getArrowTexture() != null) {
                BitmapDescriptor arrowTexture = polylineOptions.getArrowTexture();
                if (arrowTexture.getBitmap(this.f341186W.mo171543G()) != null) {
                    this.f341178O = arrowTexture.getFormater().getBitmapId();
                }
            }
            this.f341179P = polylineOptions.getArrowSpacing();
            this.f341172I = polylineOptions.isRoad();
            Animation animation = polylineOptions.getAnimation();
            if (animation != null) {
                mo171390a(((C113805hi) animation).f340538a);
            }
            int[][] colors = polylineOptions.getColors();
            if (colors != null && colors.length == 2) {
                int[] iArr = colors[0];
                int[] iArr2 = colors[1];
                if (!(iArr == null || iArr2 == null)) {
                    setColors(iArr, iArr2);
                }
            }
            this.f341202y = m158678a(polylineOptions.getColorType());
            setText(polylineOptions.getText());
            setGradientEnable(polylineOptions.isGradientEnable());
            mo172607r();
            m158693d();
        }
    }

    public final void setText(PolylineOptions.Text text) {
        if (this.f341170G != text) {
            this.f341170G = text;
            this.f341182S = true;
        }
    }

    public final void setVisible(boolean z) {
        super.setVisible(z);
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.setVisible(z);
        }
    }

    public final void setWidth(float f) {
        if (f < 0.0f) {
            f = 1.0f;
        }
        if (f > 128.0f) {
            f = 128.0f;
        }
        setStrokeWidth(f);
    }

    public final boolean startAnimation() {
        C113805hi a;
        if (this.f341183T == null || (a = C113829ih.m157227a(this.f341196s.mo172414F(), this.f341183T)) == null) {
            return false;
        }
        mo171390a(a.f340538a);
        return false;
    }

    /* renamed from: b */
    private ArrayList<GeoPoint> m158688b(List<C114040a> list) {
        ArrayList<GeoPoint> arrayList = new ArrayList<>();
        if (list != null && list.size() >= 2) {
            float f = this.f341167D.f341207a;
            float f2 = this.f341168E;
            float f3 = (this.f341173J - f) * f2;
            float f4 = f - (f * f2);
            float f5 = f + f3;
            C114040a aVar = null;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                C114040a aVar2 = list.get(i);
                float f6 = aVar2.f341207a;
                if (f6 > f4 && f6 < f5) {
                    if (aVar != null) {
                        float f7 = aVar.f341207a;
                        if (f7 < f4) {
                            C114040a a = m158677a(aVar, aVar2, (f4 - f7) / (f6 - f7));
                            a.f341208b = aVar.f341208b;
                            arrayList.add(a);
                        }
                    }
                    arrayList.add(aVar2);
                } else if (f6 > f5) {
                    if (aVar != null) {
                        float f8 = aVar.f341207a;
                        if (f8 < f5) {
                            C114040a a2 = m158677a(aVar, aVar2, (f5 - f8) / (f6 - f8));
                            a2.f341208b = aVar2.f341208b;
                            arrayList.add(a2);
                        }
                    }
                } else if (Float.compare(f6, f4) == 0 || Float.compare(aVar2.f341207a, f5) == 0) {
                    arrayList.add(aVar2);
                }
                i++;
                aVar = aVar2;
            }
        }
        return arrayList;
    }

    public final void setColorTexture(BitmapDescriptor bitmapDescriptor) {
        if (this.f341196s != null && bitmapDescriptor != null && bitmapDescriptor.getFormater() != null) {
            this.f341203z = bitmapDescriptor;
            bitmapDescriptor.getBitmap(this.f341196s.getContext());
            this.f341202y = PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
            mo172606q();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pc$a */
    public static class C114040a extends GeoPoint {

        /* renamed from: a */
        public float f341207a = 0.0f;

        /* renamed from: b */
        public int f341208b = 0;

        public C114040a() {
        }

        public final String toString() {
            return super.toString() + "," + this.f341207a;
        }

        public C114040a(GeoPoint geoPoint) {
            super(geoPoint);
        }
    }

    /* renamed from: a */
    private void m158683a(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor.getBitmap(this.f341186W.mo171543G()) != null) {
            this.f341178O = bitmapDescriptor.getFormater().getBitmapId();
        }
    }

    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    /* renamed from: a */
    private void m158679a(int i) {
        this.f341179P = i;
    }

    /* renamed from: d */
    private void m158694d(List<Integer> list) {
        this.f341180Q = list;
        mo172606q();
    }

    /* renamed from: a */
    private void m158685a(List<LatLng> list) {
        int size;
        this.f341185V = list;
        if (list != null && (size = list.size()) > 0) {
            this.f341173J = 0.0f;
            this.f341193p.clear();
            C114040a aVar = null;
            for (int i = 0; i < size; i++) {
                LatLng latLng = list.get(i);
                if (latLng != null) {
                    C114040a aVar2 = new C114040a(GeoPoint.from(latLng));
                    if (aVar != null) {
                        float hypot = this.f341173J + ((float) (Math.hypot((double) (aVar2.getLatitudeE6() - aVar.getLatitudeE6()), (double) (aVar2.getLongitudeE6() - aVar.getLongitudeE6())) + 0.0d));
                        this.f341173J = hypot;
                        aVar2.f341207a = hypot;
                        aVar2.f341208b = aVar.f341208b + 1;
                    }
                    this.f341193p.add(aVar2);
                    aVar = aVar2;
                }
            }
            mo172606q();
        }
    }

    /* renamed from: b */
    public final void mo171392b(boolean z) {
        this.f341174K = z;
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.f341508a.f340259E = z;
        }
        mo172606q();
    }

    /* renamed from: a */
    private PolylineOptions.ColorType m158678a(PolylineOptions.ColorType colorType) {
        if (colorType != PolylineOptions.ColorType.LINE_COLOR_NONE) {
            return colorType;
        }
        int[] iArr = this.f341198u;
        if (iArr == null || iArr.length <= 0) {
            int i = this.f341065f;
            return (i < 0 || i >= 12) ? PolylineOptions.ColorType.LINE_COLOR_ARGB : PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f341198u[i2];
            if (i3 < 0 || i3 >= 12) {
                return PolylineOptions.ColorType.LINE_COLOR_ARGB;
            }
        }
        return PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
    }

    /* renamed from: b */
    private void m158689b(float f) {
        this.f341195r = f;
    }

    /* renamed from: c */
    private void m158692c(boolean z) {
        this.f341175L = z;
        mo172606q();
    }

    /* renamed from: a */
    public final void mo172017a(IndoorBuilding indoorBuilding) {
        super.mo172017a(indoorBuilding);
        C114105qf qfVar = this.f341190a;
        if (qfVar != null) {
            qfVar.mo172017a(indoorBuilding);
        }
    }

    /* renamed from: a */
    private static float m158672a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint2 == null) {
            return 0.0f;
        }
        return (float) (Math.hypot((double) (geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6()), (double) (geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6())) + 0.0d);
    }

    /* renamed from: a */
    private static C114040a m158677a(C114040a aVar, C114040a aVar2, float f) {
        C114040a aVar3 = new C114040a();
        int longitudeE6 = aVar2.getLongitudeE6() - aVar.getLongitudeE6();
        aVar3.setLatitudeE6(aVar.getLatitudeE6() + Math.round(((float) (aVar2.getLatitudeE6() - aVar.getLatitudeE6())) * f));
        aVar3.setLongitudeE6(aVar.getLongitudeE6() + Math.round(((float) longitudeE6) * f));
        float f2 = aVar.f341207a;
        aVar3.f341207a = f2 + ((aVar2.f341207a - f2) * f);
        return aVar3;
    }

    /* renamed from: a */
    private static float m158673a(C114040a aVar, C114040a aVar2, GeoPoint geoPoint, C114040a aVar3) {
        double hypot;
        int longitudeE6 = aVar.getLongitudeE6();
        int latitudeE6 = aVar.getLatitudeE6();
        int longitudeE62 = aVar2.getLongitudeE6();
        int latitudeE62 = aVar2.getLatitudeE6();
        int longitudeE63 = geoPoint.getLongitudeE6();
        int latitudeE63 = geoPoint.getLatitudeE6();
        int i = longitudeE62 - longitudeE6;
        int i2 = longitudeE63 - longitudeE6;
        int i3 = latitudeE62 - latitudeE6;
        int i4 = latitudeE63 - latitudeE6;
        float f = (float) ((i * i2) + (i3 * i4));
        if (f <= 0.0f) {
            aVar3.setLatitudeE6(aVar.getLatitudeE6());
            aVar3.setLongitudeE6(aVar.getLongitudeE6());
            aVar3.f341207a = aVar.f341207a;
            hypot = Math.hypot((double) i2, (double) i4);
        } else {
            double d = (double) ((i * i) + (i3 * i3));
            double d2 = (double) f;
            if (d2 >= d) {
                aVar3.setLatitudeE6(aVar2.getLatitudeE6());
                aVar3.setLongitudeE6(aVar2.getLongitudeE6());
                aVar3.f341207a = aVar2.f341207a;
                hypot = Math.hypot((double) (longitudeE63 - longitudeE62), (double) (latitudeE63 - latitudeE62));
            } else {
                float f2 = (float) (d2 / d);
                float f3 = ((float) longitudeE6) + (((float) i) * f2);
                float f4 = ((float) latitudeE6) + (((float) i3) * f2);
                aVar3.setLongitudeE6(Math.round(f3));
                aVar3.setLatitudeE6(Math.round(f4));
                float f5 = aVar.f341207a;
                aVar3.f341207a = f5 + ((aVar2.f341207a - f5) * f2);
                hypot = Math.hypot((double) (((float) longitudeE63) - f3), (double) (((float) latitudeE63) - f4));
            }
        }
        return (float) hypot;
    }

    /* renamed from: a */
    private void m158684a(Polyline polyline) {
        this.f341192o = polyline;
    }

    /* renamed from: a */
    public final void mo171388a(float f) {
        this.f341166C = f;
        mo172606q();
    }

    /* renamed from: a */
    public final void mo171389a(int i, LatLng latLng) {
        GeoPoint from = GeoPoint.from(latLng);
        if (i != -1 && from != null) {
            this.f341176M = i;
            this.f341177N = from;
            C114105qf qfVar = this.f341190a;
            if (qfVar != null) {
                qfVar.mo172711a(i, from);
            }
            C113961mq mqVar = this.f341196s;
            if (mqVar != null) {
                mqVar.f340914v = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo171390a(C113820hz hzVar) {
        C113820hz hzVar2 = this.f341165B;
        if (hzVar2 != null) {
            hzVar2.f340556b = false;
            hzVar2.mo172205a((C113820hz.C113822b) null);
        }
        if (hzVar instanceof C113824ib) {
            m158681a((C113824ib) hzVar);
        } else if (hzVar instanceof C113819hy) {
            m158680a((C113819hy) hzVar);
        } else {
            this.f341165B = null;
        }
    }

    /* renamed from: a */
    public final void mo171391a(boolean z) {
        m158692c(z);
    }

    /* renamed from: a */
    private void m158681a(C113824ib ibVar) {
        if (this.f341196s != null) {
            this.f341165B = ibVar;
            GeoPoint from = GeoPoint.from(ibVar.f340565i);
            C114040a a = m158676a(from);
            this.f341167D = a;
            if (a == null) {
                C113889km.m157549c("Error, start point not found. [p=" + from + "] [offsetGeoPoints=" + this.f341193p + "]");
                return;
            }
            ibVar.mo172205a(this.f341189Z);
            ibVar.mo172206a((GeoPoint) null, (GeoPoint) null);
            this.f341196s.f340914v = true;
        }
    }

    /* renamed from: a */
    private void m158680a(C113819hy hyVar) {
        this.f341165B = hyVar;
        hyVar.mo172205a(this.f341189Z);
        this.f341165B.mo172206a((GeoPoint) null, (GeoPoint) null);
        C113961mq mqVar = this.f341196s;
        if (mqVar != null) {
            mqVar.f340914v = true;
        }
    }

    /* renamed from: a */
    private C114040a m158676a(GeoPoint geoPoint) {
        C114040a aVar = new C114040a();
        List<C114040a> list = this.f341193p;
        C114040a aVar2 = null;
        if (!(list == null || list.size() < 2 || geoPoint == null)) {
            C114040a aVar3 = this.f341193p.get(0);
            int i = 1;
            float f = Float.MAX_VALUE;
            while (i < this.f341193p.size()) {
                C114040a aVar4 = this.f341193p.get(i);
                float a = m158673a(aVar3, aVar4, geoPoint, aVar);
                if (a < f) {
                    f = a;
                    aVar2 = aVar;
                    aVar = new C114040a();
                }
                i++;
                aVar3 = aVar4;
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    private static int m158675a(Context context, BitmapDescriptor bitmapDescriptor) {
        Bitmap bitmap;
        int height;
        if (context == null || bitmapDescriptor == null || (bitmap = bitmapDescriptor.getBitmap(context)) == null || (height = bitmap.getHeight()) <= 0) {
            return 0;
        }
        return (int) ((Math.pow(2.0d, 25.0d) / Math.pow((double) height, 2.0d)) / ((double) C113801hf.m157135a(context)));
    }
}
