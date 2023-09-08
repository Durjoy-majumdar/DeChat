package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.core.provider.TypeModifier;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.security.InvalidParameterException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import p1108f3.C107453d;
import p1123ii.C108464b;
import p203mi.C109628a;
import p253vi.C111515a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.chatroom.ui.i2 */
public class C104608i2 extends View {

    /* renamed from: Q0 */
    public static int f310589Q0;

    /* renamed from: R0 */
    public static int f310590R0;

    /* renamed from: S0 */
    public static int f310591S0;

    /* renamed from: T0 */
    public static int f310592T0;

    /* renamed from: y0 */
    public static int f310593y0;

    /* renamed from: A */
    public int f310594A = -1;

    /* renamed from: B */
    public int f310595B = 1;

    /* renamed from: C */
    public int f310596C = 7;

    /* renamed from: D */
    public int f310597D = 7;

    /* renamed from: E */
    public int f310598E = 0;

    /* renamed from: F */
    public int f310599F;

    /* renamed from: G */
    public Boolean f310600G;

    /* renamed from: H */
    public int f310601H = 32;

    /* renamed from: I */
    public int f310602I = 0;

    /* renamed from: J */
    public int f310603J;

    /* renamed from: K */
    public int f310604K;

    /* renamed from: L */
    public final Time f310605L;

    /* renamed from: M */
    public final Calendar f310606M;

    /* renamed from: N */
    public final Calendar f310607N;

    /* renamed from: P */
    public final Boolean f310608P;

    /* renamed from: Q */
    public Context f310609Q;

    /* renamed from: R */
    public int f310610R = 6;

    /* renamed from: S */
    public DateFormatSymbols f310611S = new DateFormatSymbols();

    /* renamed from: T */
    public C104610b f310612T;

    /* renamed from: U */
    public final C104612d f310613U = new C104612d();

    /* renamed from: V */
    public Collection<C109628a> f310614V = new ArrayList();

    /* renamed from: W */
    public int f310615W = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f310616d = 80;

    /* renamed from: e */
    public Paint f310617e;

    /* renamed from: f */
    public Paint f310618f;

    /* renamed from: g */
    public Paint f310619g;

    /* renamed from: h */
    public Paint f310620h;

    /* renamed from: i */
    public Paint f310621i;

    /* renamed from: j */
    public int f310622j;

    /* renamed from: n */
    public int f310623n;

    /* renamed from: o */
    public int f310624o;

    /* renamed from: p */
    public int f310625p;

    /* renamed from: p0 */
    public int f310626p0 = Integer.MIN_VALUE;

    /* renamed from: q */
    public int f310627q;

    /* renamed from: r */
    public int f310628r;

    /* renamed from: s */
    public final StringBuilder f310629s;

    /* renamed from: t */
    public boolean f310630t = false;

    /* renamed from: u */
    public int f310631u = -1;

    /* renamed from: v */
    public int f310632v = -1;

    /* renamed from: w */
    public int f310633w = -1;

    /* renamed from: x */
    public int f310634x = -1;

    /* renamed from: x0 */
    public Map<Integer, Pair<C109628a, Rect>> f310635x0 = new HashMap();

    /* renamed from: y */
    public int f310636y = -1;

    /* renamed from: z */
    public int f310637z = -1;

    /* renamed from: com.tencent.mm.chatroom.ui.i2$a */
    public class C104609a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Collection f310638d;

        public C104609a(Collection collection) {
            this.f310638d = collection;
        }

        public void run() {
            ArrayList arrayList;
            C104608i2.m140194a(C104608i2.this);
            C104608i2 i2Var = C104608i2.this;
            ArrayList arrayList2 = new ArrayList(this.f310638d);
            i2Var.getClass();
            if (!arrayList2.isEmpty()) {
                int i = C104608i2.f310591S0;
                int i2 = i2Var.f310603J - (i2Var.f310616d * 2);
                int i3 = i2Var.f310596C;
                int i4 = i2 / (i3 * 2);
                int i5 = i2Var.f310598E;
                int i6 = i2Var.f310595B;
                if (i5 < i6) {
                    i5 += i3;
                }
                int i7 = i5 - i6;
                ListIterator listIterator = arrayList2.listIterator();
                while (listIterator.hasNext()) {
                    if (((C109628a) listIterator.next()).f328200c != i2Var.f310599F) {
                        listIterator.remove();
                    }
                }
                Collections.sort(arrayList2, new C104613j2(i2Var));
                int i8 = 1;
                int i9 = 1;
                int i15 = 0;
                while (i8 <= i2Var.f310597D && i15 < arrayList2.size() && (i8 <= (r10 = i2Var.f310594A) || -1 == r10)) {
                    int i16 = (i7 * 2 * i4) + i2Var.f310616d;
                    if (((C109628a) arrayList2.get(i15)).f328199b == i8) {
                        arrayList = arrayList2;
                        HashMap hashMap = (HashMap) i2Var.f310635x0;
                        hashMap.put(Integer.valueOf(i9), new Pair((C109628a) arrayList2.get(i15), new Rect(i16, i, (i4 * 2) + i16, i2Var.f310601H + i)));
                        i15++;
                        i9++;
                    } else {
                        arrayList = arrayList2;
                    }
                    i7++;
                    if (i7 == i2Var.f310596C) {
                        i += i2Var.f310601H;
                        i7 = 0;
                    }
                    i8++;
                    arrayList2 = arrayList;
                }
            }
            C104608i2.this.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.i2$b */
    public interface C104610b {
    }

    /* renamed from: com.tencent.mm.chatroom.ui.i2$c */
    public class C104611c extends View.AccessibilityDelegate {
        public C104611c() {
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            return C104608i2.this.f310613U;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.i2$d */
    public class C104612d extends AccessibilityNodeProvider {
        public C104612d() {
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C104608i2.this.getClass();
            if (!AccUtil.INSTANCE.isAccessibilityEnabled()) {
                return null;
            }
            return C104608i2.m140195b(C104608i2.this, i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            C104608i2.this.getClass();
            if (!AccUtil.INSTANCE.isAccessibilityEnabled()) {
                return false;
            }
            C104608i2 i2Var = C104608i2.this;
            boolean z = true;
            if (!((HashMap) i2Var.f310635x0).containsKey(Integer.valueOf(i))) {
                return false;
            }
            if (i2 == AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS.getId()) {
                int i3 = i2Var.f310615W;
                if (i != i3) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    i2Var.mo148181e(i3, 65536);
                }
                i2Var.f310615W = i;
                i2Var.invalidate();
                i2Var.mo148181e(i2Var.f310615W, 32768);
                return false;
            }
            if (i2 == AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId()) {
                if (!(i == i2Var.f310615W)) {
                    return false;
                }
                i2Var.f310615W = Integer.MIN_VALUE;
                i2Var.invalidate();
                i2Var.mo148181e(i, 65536);
            } else if (i2 != AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId()) {
                return false;
            } else {
                Pair pair = (Pair) ((HashMap) i2Var.f310635x0).get(Integer.valueOf(i));
                if (pair != null) {
                    i2Var.mo148178c((C109628a) pair.first);
                }
            }
            return true;
        }
    }

    public C104608i2(Context context, TypedArray typedArray) {
        super(context);
        this.f310609Q = context;
        Resources resources = context.getResources();
        this.f310607N = Calendar.getInstance();
        this.f310606M = Calendar.getInstance();
        Time time = new Time(Time.getCurrentTimezone());
        this.f310605L = time;
        time.setToNow();
        typedArray.getColor(2, resources.getColor(C0966R.color.a7c));
        typedArray.getColor(5, resources.getColor(C0966R.color.a7c));
        typedArray.getColor(3, resources.getColor(C0966R.color.a7c));
        this.f310622j = typedArray.getColor(3, resources.getColor(C0966R.color.a7d));
        this.f310623n = typedArray.getColor(6, resources.getColor(C0966R.color.a7c));
        this.f310625p = typedArray.getColor(7, resources.getColor(C0966R.color.a7c));
        this.f310627q = typedArray.getColor(4, resources.getColor(C0966R.color.f356953a41));
        this.f310628r = typedArray.getColor(8, resources.getColor(C0966R.color.aal));
        this.f310624o = typedArray.getColor(9, resources.getColor(C0966R.color.aam));
        this.f310600G = Boolean.valueOf(typedArray.getBoolean(11, false));
        this.f310629s = new StringBuilder(50);
        f310589Q0 = typedArray.getDimensionPixelSize(18, resources.getDimensionPixelSize(C0966R.dimen.aqo));
        f310592T0 = typedArray.getDimensionPixelSize(20, resources.getDimensionPixelSize(C0966R.dimen.aqq));
        f310590R0 = typedArray.getDimensionPixelSize(19, resources.getDimensionPixelSize(C0966R.dimen.aqp));
        f310591S0 = typedArray.getDimensionPixelOffset(14, resources.getDimensionPixelOffset(C0966R.dimen.f357035ab0));
        f310593y0 = typedArray.getDimensionPixelSize(17, resources.getDimensionPixelOffset(C0966R.dimen.am6));
        this.f310601H = (typedArray.getDimensionPixelSize(0, resources.getDimensionPixelOffset(C0966R.dimen.f4204w1)) - f310591S0) / 6;
        this.f310602I = typedArray.getDimensionPixelSize(1, resources.getDimensionPixelOffset(C0966R.dimen.f4248xk));
        this.f310608P = Boolean.valueOf(typedArray.getBoolean(12, true));
        Paint paint = new Paint();
        this.f310620h = paint;
        paint.setAntiAlias(true);
        this.f310620h.setTextSize((float) f310592T0);
        this.f310620h.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        this.f310620h.setColor(this.f310622j);
        this.f310620h.setTextAlign(Paint.Align.LEFT);
        this.f310620h.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f310619g = paint2;
        paint2.setFakeBoldText(true);
        this.f310619g.setAntiAlias(true);
        this.f310619g.setColor(this.f310624o);
        this.f310619g.setTextAlign(Paint.Align.CENTER);
        this.f310619g.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f310621i = paint3;
        paint3.setFakeBoldText(true);
        this.f310621i.setAntiAlias(true);
        this.f310621i.setColor(this.f310628r);
        this.f310621i.setTextAlign(Paint.Align.CENTER);
        this.f310621i.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint();
        this.f310617e = paint4;
        paint4.setAntiAlias(true);
        this.f310617e.setTextSize((float) f310590R0);
        this.f310617e.setColor(this.f310622j);
        this.f310617e.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        this.f310617e.setStyle(Paint.Style.FILL);
        this.f310617e.setTextAlign(Paint.Align.CENTER);
        this.f310617e.setFakeBoldText(true);
        Paint paint5 = new Paint();
        this.f310618f = paint5;
        paint5.setAntiAlias(true);
        this.f310618f.setTextSize((float) f310589Q0);
        this.f310618f.setStyle(Paint.Style.FILL);
        this.f310618f.setTextAlign(Paint.Align.CENTER);
        this.f310618f.setFakeBoldText(false);
        setAccessibilityDelegate(new C104611c());
    }

    /* renamed from: a */
    public static void m140194a(C104608i2 i2Var) {
        int i = i2Var.f310603J;
        int i2 = i2Var.f310616d;
        int i3 = ((i - (i2 * 2)) / (i2Var.f310596C * 2)) + i2;
        int i4 = f310592T0;
        int i5 = i3 - (i4 / 2);
        int i6 = ((f310591S0 - i4) / 2) + i4;
        Rect rect = new Rect();
        StringBuilder sb = new StringBuilder(i2Var.getMonthAndYearString().toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        i2Var.f310620h.getTextBounds(sb.toString(), 0, sb.length(), rect);
        rect.set(rect.left - 20, rect.top - 20, rect.right + 20, rect.bottom + 20);
        rect.offset(i5, i6);
        ((HashMap) i2Var.f310635x0).put(0, new Pair((Object) null, rect));
    }

    /* renamed from: b */
    public static AccessibilityNodeInfo m140195b(C104608i2 i2Var, int i) {
        i2Var.getClass();
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C107453d dVar = new C107453d(obtain);
        if (((HashMap) i2Var.f310635x0).isEmpty()) {
            obtain.recycle();
        } else {
            int[] iArr = new int[2];
            i2Var.getLocationOnScreen(iArr);
            if (i == -1) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                ViewParent f = C107207u.C107208b.m145178f(i2Var);
                if (f instanceof View) {
                    dVar.f321474b = -1;
                    obtain.setParent((View) f);
                }
                i2Var.onInitializeAccessibilityNodeInfo(obtain);
                dVar.f321475c = i;
                obtain.setSource(i2Var, i);
                dVar.mo157852l("com.tencent.mm.chatroom.ui.SimpleMonthView");
                for (Integer intValue : ((HashMap) i2Var.f310635x0).keySet()) {
                    dVar.f321473a.addChild(i2Var, intValue.intValue());
                }
                return dVar.f321473a;
            } else if (i == 0) {
                if (((HashMap) i2Var.f310635x0).get(Integer.valueOf(i)) == null) {
                    return obtain;
                }
                dVar.f321474b = -1;
                obtain.setParent(i2Var, -1);
                Rect rect = new Rect((Rect) ((Pair) ((HashMap) i2Var.f310635x0).get(Integer.valueOf(i))).second);
                rect.offset(iArr[0], iArr[1]);
                dVar.mo157850j(rect);
                dVar.f321475c = i;
                obtain.setSource(i2Var, i);
                dVar.mo157852l("android.view.View");
                obtain.setPackageName(i2Var.getContext().getPackageName());
                dVar.mo157854n(i2Var.getMonthAndYearString());
                dVar.mo157862u(true);
                dVar.mo157856p(true);
                dVar.mo157855o(true);
                obtain.setVisibleToUser(true);
                obtain.setClickable(false);
                obtain.setLongClickable(false);
                dVar.mo157851k(false);
                if (i2Var.f310615W == 0) {
                    dVar.mo157846g(true);
                } else {
                    dVar.mo157846g(false);
                }
                dVar.mo157840b(C107453d.C107454a.f321479f);
                dVar.mo157840b(C107453d.C107454a.f321482i);
                dVar.mo157840b(C107453d.C107454a.f321481h);
                return obtain;
            } else {
                dVar.f321474b = -1;
                obtain.setParent(i2Var, -1);
                if (((HashMap) i2Var.f310635x0).containsKey(Integer.valueOf(i))) {
                    Rect rect2 = new Rect((Rect) ((Pair) ((HashMap) i2Var.f310635x0).get(Integer.valueOf(i))).second);
                    rect2.offset(iArr[0], iArr[1]);
                    dVar.mo157850j(rect2);
                    dVar.f321475c = i;
                    obtain.setSource(i2Var, i);
                    dVar.mo157852l(TypeModifier.BUTTON_CLASS);
                    obtain.setPackageName(i2Var.getContext().getPackageName());
                    dVar.mo157866y("" + ((C109628a) ((Pair) ((HashMap) i2Var.f310635x0).get(Integer.valueOf(i))).first).f328199b);
                    dVar.mo157862u(true);
                    dVar.mo157856p(true);
                    dVar.mo157855o(true);
                    obtain.setVisibleToUser(true);
                    obtain.setClickable(true);
                    obtain.setLongClickable(false);
                    dVar.mo157851k(false);
                    if (i2Var.f310615W == i) {
                        dVar.mo157846g(true);
                    } else {
                        dVar.mo157846g(false);
                    }
                    dVar.mo157840b(C107453d.C107454a.f321478e);
                    dVar.mo157840b(C107453d.C107454a.f321479f);
                    dVar.mo157840b(C107453d.C107454a.f321482i);
                    dVar.mo157840b(C107453d.C107454a.f321481h);
                    return obtain;
                }
            }
        }
        return null;
    }

    private String getMonthAndYearString() {
        this.f310629s.setLength(0);
        long timeInMillis = this.f310606M.getTimeInMillis();
        return DateUtils.formatDateRange(getContext(), timeInMillis, timeInMillis, 52);
    }

    /* renamed from: c */
    public final void mo148178c(C109628a aVar) {
        if (this.f310612T != null) {
            if (!this.f310608P.booleanValue()) {
                int i = aVar.f328200c;
                Time time = this.f310605L;
                if (i == time.month && aVar.f328201d == time.year && aVar.f328199b < time.monthDay) {
                    return;
                }
            }
            C108464b bVar = (C108464b) this.f310612T;
            if (aVar != null) {
                bVar.mo159009F4(aVar);
            } else {
                bVar.getClass();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo148179d(int i, Time time) {
        int i2 = this.f310604K;
        int i3 = time.year;
        return i2 < i3 || (i2 == i3 && this.f310599F < time.month) || (this.f310599F == time.month && i < time.monthDay);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (AccUtil.INSTANCE.isAccessibilityEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Iterator it = ((HashMap) this.f310635x0).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Rect) ((Pair) entry.getValue()).second).contains((int) x, (int) y)) {
                        i = ((Integer) entry.getKey()).intValue();
                        break;
                    }
                }
                int i2 = this.f310626p0;
                if (i2 != i) {
                    this.f310626p0 = i;
                    if (i != Integer.MIN_VALUE) {
                        mo148181e(i, 128);
                    }
                    mo148181e(i2, 256);
                }
                return true;
            } else if (action == 10) {
                int i3 = this.f310626p0;
                if (!(i3 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE)) {
                    this.f310626p0 = Integer.MIN_VALUE;
                    mo148181e(i3, 256);
                }
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo148181e(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(getContext().getPackageName());
        obtain.setSource(this, i);
        return getParent().requestSendAccessibilityEvent(this, obtain);
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Canvas canvas2 = canvas;
        int i44 = this.f310603J;
        int i45 = this.f310616d;
        int i46 = ((i44 - (i45 * 2)) / (this.f310596C * 2)) + i45;
        int i47 = f310592T0;
        int i48 = i46 - (i47 / 2);
        int i49 = ((f310591S0 - i47) / 2) + i47;
        StringBuilder sb = new StringBuilder(getMonthAndYearString().toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        canvas2.drawText(sb.toString(), (float) i48, (float) i49, this.f310620h);
        int i54 = f310591S0;
        int i55 = 1;
        canvas.drawLine(0.0f, (float) i54, (float) this.f310603J, (float) (i54 + 1), this.f310620h);
        int i56 = f310591S0 - (f310590R0 / 2);
        int i57 = (this.f310603J - (this.f310616d * 2)) / (this.f310596C * 2);
        int i58 = 0;
        while (true) {
            i = this.f310596C;
            if (i58 >= i) {
                break;
            }
            int i59 = (this.f310595B + i58) % i;
            int i64 = (((i58 * 2) + 1) * i57) + this.f310616d;
            this.f310607N.set(7, i59);
            canvas2.drawText(this.f310611S.getShortWeekdays()[this.f310607N.get(7)].toUpperCase(Locale.getDefault()), (float) i64, (float) i56, this.f310617e);
            i58++;
        }
        int i65 = (((this.f310601H + f310589Q0) / 2) - 1) + f310591S0;
        int i66 = (this.f310603J - (this.f310616d * 2)) / (i * 2);
        int i67 = this.f310598E;
        int i68 = this.f310595B;
        if (i67 < i68) {
            i67 += i;
        }
        int i69 = i67 - i68;
        int i74 = 1;
        while (i74 <= this.f310597D) {
            int i75 = this.f310594A;
            if (i74 <= i75 || -1 == i75) {
                int i76 = (((i69 * 2) + i55) * i66) + this.f310616d;
                int i77 = this.f310599F;
                if ((i77 == this.f310633w && this.f310631u == i74 && this.f310636y == this.f310604K) || ((i77 == this.f310634x && this.f310632v == i74 && this.f310637z == this.f310604K) || (this.f310630t && i75 == i74 && this.f310631u == -1))) {
                    if (this.f310600G.booleanValue()) {
                        int i78 = f310593y0;
                        int i79 = i65 - (f310589Q0 / 3);
                        canvas2.drawRoundRect(new RectF((float) (i76 - i78), (float) (i79 - i78), (float) (i76 + i78), (float) (i79 + i78)), 10.0f, 10.0f, this.f310621i);
                    } else {
                        canvas2.drawCircle((float) i76, (float) (i65 - (f310589Q0 / 3)), (float) f310593y0, this.f310621i);
                    }
                    if (this.f310630t && this.f310594A == i74 && this.f310631u == -1) {
                        this.f310618f.setColor(this.f310628r);
                        this.f310618f.setTypeface(Typeface.defaultFromStyle(0));
                        this.f310618f.setTextSize(30.0f);
                        canvas2.drawText(this.f310609Q.getResources().getString(C0966R.string.k3d), (float) i76, (float) (i65 + 12 + f310593y0), this.f310618f);
                    }
                }
                this.f310618f.setTextSize((float) f310589Q0);
                if (!this.f310630t || this.f310594A != i74) {
                    this.f310618f.setColor(this.f310623n);
                    this.f310618f.setTypeface(Typeface.defaultFromStyle(0));
                }
                int i84 = this.f310631u;
                if (i84 != -1 && (i37 = this.f310632v) != -1 && (i38 = this.f310636y) == this.f310637z && (i39 = this.f310633w) == this.f310634x && i84 == i37 && i74 == i84 && this.f310599F == i39 && this.f310604K == i38) {
                    this.f310618f.setColor(this.f310628r);
                }
                int i85 = this.f310631u;
                if (i85 != -1 && (i27 = this.f310632v) != -1 && (i28 = this.f310636y) == this.f310637z && i28 == this.f310604K && (((i29 = this.f310599F) == (i35 = this.f310633w) && this.f310634x == i35 && ((i85 < i27 && i74 > i85 && i74 < i27) || (i85 > i27 && i74 < i85 && i74 > i27))) || ((i35 < (i36 = this.f310634x) && i29 == i35 && i74 > i85) || ((i35 < i36 && i29 == i36 && i74 < i27) || ((i35 > i36 && i29 == i35 && i74 < i85) || (i35 > i36 && i29 == i36 && i74 > i27)))))) {
                    this.f310618f.setColor(this.f310628r);
                }
                int i86 = this.f310631u;
                if (!(i86 == -1 || (i16 = this.f310632v) == -1 || (i17 = this.f310636y) == (i18 = this.f310637z) || (((i17 != (i19 = this.f310604K) || this.f310599F != this.f310633w) && (i18 != i19 || this.f310599F != this.f310634x)) || (((i25 = this.f310633w) >= (i26 = this.f310634x) || this.f310599F != i25 || i74 >= i86) && ((i25 >= i26 || this.f310599F != i26 || i74 <= i16) && ((i25 <= i26 || this.f310599F != i25 || i74 <= i86) && (i25 <= i26 || this.f310599F != i26 || i74 >= i16))))))) {
                    this.f310618f.setColor(this.f310628r);
                }
                if (this.f310631u != -1 && this.f310632v != -1 && (i6 = this.f310636y) == this.f310637z && this.f310604K == i6 && (((i7 = this.f310599F) > (i8 = this.f310633w) && i7 < (i15 = this.f310634x) && i8 < i15) || (i7 < i8 && i7 > (i9 = this.f310634x) && i8 > i9))) {
                    this.f310618f.setColor(this.f310628r);
                }
                if (!(this.f310631u == -1 || this.f310632v == -1 || (i2 = this.f310636y) == (i3 = this.f310637z) || ((i2 >= i3 || (((i5 = this.f310599F) <= this.f310633w || this.f310604K != i2) && (i5 >= this.f310634x || this.f310604K != i3))) && (i2 <= i3 || (((i4 = this.f310599F) >= this.f310633w || this.f310604K != i2) && (i4 <= this.f310634x || this.f310604K != i3)))))) {
                    this.f310618f.setColor(this.f310628r);
                }
                if (!this.f310608P.booleanValue() && mo148179d(i74, this.f310605L)) {
                    Time time = this.f310605L;
                    if (time.month == this.f310599F && time.year == this.f310604K) {
                        this.f310618f.setColor(this.f310625p);
                        this.f310618f.setTypeface(Typeface.defaultFromStyle(2));
                    }
                }
                for (C109628a next : this.f310614V) {
                    if (next.f328199b == i74 && next.f328200c == this.f310599F && next.f328201d == this.f310604K) {
                        this.f310618f.setColor(this.f310627q);
                        this.f310618f.setTypeface(Typeface.defaultFromStyle(0));
                    }
                }
                int i87 = this.f310599F;
                if ((i87 == this.f310633w && this.f310631u == i74 && this.f310636y == this.f310604K) || ((i87 == this.f310634x && this.f310632v == i74 && this.f310637z == this.f310604K) || (this.f310630t && this.f310594A == i74 && this.f310631u == -1))) {
                    this.f310618f.setTypeface(Typeface.defaultFromStyle(0));
                    this.f310618f.setColor(-1);
                }
                canvas2.drawText(String.format("%d", new Object[]{Integer.valueOf(i74)}), (float) i76, (float) i65, this.f310618f);
                i69++;
                if (i69 == this.f310596C) {
                    i65 += this.f310601H;
                    i69 = 0;
                }
                i74++;
                i55 = 1;
            } else {
                return;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f310601H * this.f310610R) + f310591S0 + this.f310602I);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f310603J = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = this.f310616d;
            float f = (float) i;
            C109628a aVar = null;
            if (x >= f) {
                int i2 = this.f310603J - i;
                if (x <= ((float) i2)) {
                    float f2 = (float) f310591S0;
                    if (y >= f2) {
                        int i3 = ((int) (y - f2)) / this.f310601H;
                        float f3 = x - f;
                        int i4 = this.f310596C;
                        int i5 = (int) ((f3 * ((float) i4)) / ((float) (i2 - i)));
                        int i6 = this.f310598E;
                        int i7 = this.f310595B;
                        if (i6 < i7) {
                            i6 += i4;
                        }
                        int i8 = (i5 - (i6 - i7)) + 1 + (i3 * i4);
                        int i9 = this.f310599F;
                        if (i9 <= 11 && i9 >= 0 && C111515a.m152017a(i9, this.f310604K) >= i8 && i8 >= 1) {
                            C109628a aVar2 = new C109628a(this.f310604K, this.f310599F, i8);
                            Iterator<C109628a> it = this.f310614V.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C109628a next = it.next();
                                if (next.equals(aVar2)) {
                                    aVar = next;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (aVar != null) {
                mo148178c(aVar);
            }
        }
        return true;
    }

    public void setMarkDate(Collection<C109628a> collection) {
        if (collection != null) {
            this.f310614V = collection;
            post(new C104609a(collection));
            return;
        }
        Log.m105920e("MicroMsg.SimpleMonthView", "markDateList is null");
    }

    public void setMonthParams(HashMap<String, Integer> hashMap) {
        int i;
        if (hashMap.containsKey("month") || hashMap.containsKey("year")) {
            setTag(hashMap);
            if (hashMap.containsKey("height")) {
                int intValue = hashMap.get("height").intValue();
                this.f310601H = intValue;
                if (intValue < 10) {
                    this.f310601H = 10;
                }
            }
            if (hashMap.containsKey("selected_begin_day")) {
                this.f310631u = hashMap.get("selected_begin_day").intValue();
            }
            if (hashMap.containsKey("selected_last_day")) {
                this.f310632v = hashMap.get("selected_last_day").intValue();
            }
            if (hashMap.containsKey("selected_begin_month")) {
                this.f310633w = hashMap.get("selected_begin_month").intValue();
            }
            if (hashMap.containsKey("selected_last_month")) {
                this.f310634x = hashMap.get("selected_last_month").intValue();
            }
            if (hashMap.containsKey("selected_begin_year")) {
                this.f310636y = hashMap.get("selected_begin_year").intValue();
            }
            if (hashMap.containsKey("selected_last_year")) {
                this.f310637z = hashMap.get("selected_last_year").intValue();
            }
            this.f310599F = hashMap.get("month").intValue();
            this.f310604K = hashMap.get("year").intValue();
            int i2 = 0;
            this.f310630t = false;
            this.f310594A = -1;
            this.f310606M.set(2, this.f310599F);
            this.f310606M.set(1, this.f310604K);
            this.f310606M.set(5, 1);
            this.f310598E = this.f310606M.get(7);
            if (hashMap.containsKey("week_start")) {
                this.f310595B = hashMap.get("week_start").intValue();
            } else {
                this.f310595B = this.f310606M.getFirstDayOfWeek();
            }
            this.f310597D = C111515a.m152017a(this.f310599F, this.f310604K);
            int i3 = 0;
            while (true) {
                i = this.f310597D;
                if (i3 >= i) {
                    break;
                }
                i3++;
                Time time = this.f310605L;
                if (this.f310604K == time.year && this.f310599F == time.month && i3 == time.monthDay) {
                    this.f310630t = true;
                    this.f310594A = i3;
                }
                mo148179d(i3, time);
            }
            int i4 = this.f310598E;
            int i5 = this.f310595B;
            if (i4 < i5) {
                i4 += this.f310596C;
            }
            int i6 = (i4 - i5) + i;
            int i7 = this.f310596C;
            int i8 = i6 / i7;
            if (i6 % i7 > 0) {
                i2 = 1;
            }
            this.f310610R = i8 + i2;
            return;
        }
        throw new InvalidParameterException("You must specify month and year for this view");
    }

    public void setOnDayClickListener(C104610b bVar) {
        this.f310612T = bVar;
    }
}
