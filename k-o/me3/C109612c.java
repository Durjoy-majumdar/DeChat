package me3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.C106853e;
import com.tencent.p014mm.view.footer.SelectColorBar;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import k20.C60958c;
import k20.C9556a;
import me3.C109623f;
import p1093bh.C104084a;
import p1093bh.C104085b;
import p1093bh.C104090d;
import p1093bh.C104101k;
import p248ug.C111161j0;
import p248ug.C111164r0;
import p248ug.C111167t;
import p248ug.C111168v;
import p520fi.C107547d;
import p629ny.C76979h;
import v40.C111385a;
import z20.C112573c;
import z20.C112579f;
import zt3.C119157j;

/* renamed from: me3.c */
public class C109612c implements C109623f {

    /* renamed from: a */
    public C106853e f328158a;

    /* renamed from: b */
    public C111164r0.C111165a f328159b;

    /* renamed from: c */
    public HashMap<C111167t, C104085b> f328160c;

    /* renamed from: d */
    public LinkedList<C104085b> f328161d;

    /* renamed from: e */
    public C111168v f328162e;

    /* renamed from: f */
    public Bitmap f328163f;

    /* renamed from: g */
    public boolean f328164g = true;

    /* renamed from: h */
    public boolean f328165h = true;

    /* renamed from: i */
    public float f328166i = -1.0f;

    /* renamed from: j */
    public boolean f328167j = false;

    /* renamed from: k */
    public int f328168k = -1;

    /* renamed from: l */
    public int f328169l = -1;

    /* renamed from: m */
    public C109623f.C109624a f328170m;

    /* renamed from: n */
    public int f328171n = 0;

    /* renamed from: o */
    public C109620e f328172o;

    /* renamed from: p */
    public C111167t f328173p;

    /* renamed from: q */
    public C111167t f328174q;

    /* renamed from: r */
    public boolean f328175r;

    /* renamed from: s */
    public C104085b f328176s;

    /* renamed from: me3.c$a */
    public class C109613a implements Animation.AnimationListener {

        /* renamed from: me3.c$a$a */
        public class C109614a implements Runnable {
            public C109614a() {
            }

            public void run() {
                View actionBar = C109612c.this.f328158a.getActionBar();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(actionBar, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                actionBar.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(actionBar, "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C109613a() {
        }

        public void onAnimationEnd(Animation animation) {
            EditText editText = (EditText) C109612c.this.f328158a.getTextEditView().findViewById(C0966R.C0970id.ki7);
            editText.requestFocus();
            editText.setSelection(editText.length());
            C109612c.this.f328158a.getSelectedFeatureListener().mo150362b(true);
            ((SelectColorBar) C109612c.this.f328158a.findViewById(C0966R.C0970id.j9j)).setSelectColor(editText.getCurrentTextColor());
            C109612c.this.f328158a.getActionBar().post(new C109614a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: me3.c$b */
    public class C109615b implements Animation.AnimationListener {
        public C109615b() {
        }

        public void onAnimationEnd(Animation animation) {
            ((EditText) C109612c.this.f328158a.getTextEditView().findViewById(C0966R.C0970id.ki7)).setText("");
            View textEditView = C109612c.this.f328158a.getTextEditView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(textEditView, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textEditView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(textEditView, "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C109612c.this.f328158a.getSelectedFeatureListener().mo150362b(false);
        }
    }

    /* renamed from: me3.c$c */
    public class C109616c implements C111385a {

        /* renamed from: a */
        public View f328180a;

        /* renamed from: b */
        public TextView f328181b;

        /* renamed from: c */
        public ImageView f328182c = ((ImageView) this.f328180a.findViewById(C0966R.C0970id.ix9));

        public C109616c() {
            View rubbishView = C109612c.this.f328158a.getRubbishView();
            this.f328180a = rubbishView;
            this.f328181b = (TextView) rubbishView.findViewById(C0966R.C0970id.ixa);
        }
    }

    /* renamed from: me3.c$d */
    public class C109617d implements Runnable {

        /* renamed from: d */
        public C111161j0 f328184d;

        /* renamed from: e */
        public boolean f328185e;

        /* renamed from: me3.c$d$a */
        public class C109618a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f328187d;

            public C109618a(Bitmap bitmap) {
                this.f328187d = bitmap;
            }

            public void run() {
                C109617d dVar = C109617d.this;
                dVar.f328184d.mo79184a(this.f328187d, dVar.f328185e);
            }
        }

        /* renamed from: me3.c$d$b */
        public class C109619b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Exception f328189d;

            public C109619b(Exception exc) {
                this.f328189d = exc;
            }

            public void run() {
                C109617d.this.f328184d.mo79185b(this.f328189d);
            }
        }

        public C109617d(C111161j0 j0Var, boolean z) {
            this.f328184d = j0Var;
            this.f328185e = z;
        }

        /* renamed from: a */
        public final Rect mo160842a(Bitmap bitmap) {
            Rect rect = new Rect(C109612c.this.f328158a.getBaseBoardView().getAliveRect());
            Log.m105925i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", rect, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            if (rect.bottom < 0) {
                rect.bottom = 0;
            }
            if (rect.right < 0) {
                rect.right = 0;
            }
            if (rect.bottom > bitmap.getHeight()) {
                rect.bottom = bitmap.getHeight();
            }
            if (rect.right > bitmap.getWidth()) {
                rect.right = bitmap.getWidth();
            }
            return rect;
        }

        /* renamed from: b */
        public final Rect mo160843b(Bitmap bitmap) {
            Rect a = mo160842a(bitmap);
            float width = (float) ((((double) a.width()) * 1.0d) / ((double) a.height()));
            Log.m105925i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s ratio:%f", a, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Float.valueOf(width));
            double d = (double) width;
            float f = C109612c.this.f328166i;
            if (d < ((double) f) - 0.06d || d > ((double) f) + 0.06d) {
                if (f > width) {
                    int centerY = a.centerY();
                    int width2 = (int) ((((float) a.width()) * 1.0f) / C109612c.this.f328166i);
                    Log.m105924i("MicroMsg.DrawingPresenter", "clipRect.width() : " + a.width() + " new height:" + width2);
                    int i = width2 / 2;
                    a.top = centerY - i;
                    a.bottom = centerY + i;
                    Log.m105924i("MicroMsg.DrawingPresenter", "top :" + a.top + " bottom:" + a.bottom);
                } else {
                    int centerX = a.centerX();
                    int height = (int) (((float) a.height()) * 1.0f * C109612c.this.f328166i);
                    Log.m105924i("MicroMsg.DrawingPresenter", "clipRect.height() : " + a.height() + " new width:" + height);
                    int i2 = height / 2;
                    a.left = centerX - i2;
                    a.right = centerX + i2;
                    Log.m105924i("MicroMsg.DrawingPresenter", "left :" + a.left + " right:" + a.right + " cropRectRatio:" + C109612c.this.f328166i);
                }
            }
            Log.m105924i("MicroMsg.DrawingPresenter", "ratio clipRect :" + ((((float) a.width()) * 1.0f) / ((float) a.height())));
            return a;
        }

        public void run() {
            try {
                Iterator<C104085b> it = C109612c.this.f328161d.iterator();
                while (it.hasNext()) {
                    C104085b next = it.next();
                    Bitmap bitmap = next.f307889f;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        next.f307889f.recycle();
                    }
                }
                Bitmap bitmap2 = null;
                if (!C109612c.this.f328158a.getBaseBoardView().mo157331e()) {
                    int width = C109612c.this.f328158a.getBaseBoardView().getAliveRect().width();
                    int height = C109612c.this.f328158a.getBaseBoardView().getAliveRect().height();
                    if (width > 0 && height > 0) {
                        bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                } else {
                    bitmap2 = C109612c.this.f328163f;
                }
                Bitmap bitmap3 = bitmap2;
                if (bitmap3 == null) {
                    this.f328184d.mo79185b(new NullPointerException("bitmap is null!"));
                    try {
                        Iterator<C104085b> it4 = C109612c.this.f328161d.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo145712w();
                        }
                        C109612c.this.mo160828l();
                    } catch (Exception unused) {
                    }
                } else {
                    Canvas canvas = new Canvas(bitmap3);
                    Iterator<C104085b> it5 = C109612c.this.f328161d.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo145692c().mo157976F1(canvas);
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapUtil.decodeFile(C109612c.this.f328159b.f332927d, options);
                    float height2 = (((float) options.outHeight) * 1.0f) / ((float) bitmap3.getHeight());
                    float width2 = (((float) options.outWidth) * 1.0f) / ((float) bitmap3.getWidth());
                    if (height2 <= width2) {
                        height2 = width2;
                    }
                    if (height2 == 0.0f) {
                        height2 = 1.0f;
                    }
                    C109612c cVar = C109612c.this;
                    int i = cVar.f328169l;
                    if (i > 0 && cVar.f328168k > 0) {
                        height2 = (((float) i) * 1.0f) / ((float) bitmap3.getHeight());
                        float width3 = (((float) C109612c.this.f328168k) * 1.0f) / ((float) bitmap3.getWidth());
                        if (height2 > width3) {
                            height2 = width3;
                        }
                    }
                    float c = C109612c.this.f328158a.getBaseBoardView().mo157329c(C109612c.this.f328158a.getBaseBoardView().getMainMatrix());
                    Matrix matrix = new Matrix();
                    matrix.postScale(height2, height2, 0.0f, 0.0f);
                    matrix.postRotate(-c);
                    ((C119157j) C119157j.f356862d).mo183895z(new C109618a(C109612c.this.mo160825i(bitmap3, C109612c.this.f328158a.getConfig().f332924a == C111164r0.C111166b.VIDEO_COVER ? new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight()) : C109612c.this.f328166i > 0.0f ? mo160843b(bitmap3) : mo160842a(bitmap3), c, options, matrix)));
                    try {
                        Iterator<C104085b> it6 = C109612c.this.f328161d.iterator();
                        while (it6.hasNext()) {
                            it6.next().mo145712w();
                        }
                        C109612c.this.mo160828l();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception e) {
                ((C119157j) C119157j.f356862d).mo183895z(new C109619b(e));
                Iterator<C104085b> it7 = C109612c.this.f328161d.iterator();
                while (it7.hasNext()) {
                    it7.next().mo145712w();
                }
            } catch (Throwable th) {
                try {
                    Iterator<C104085b> it8 = C109612c.this.f328161d.iterator();
                    while (it8.hasNext()) {
                        it8.next().mo145712w();
                    }
                    C109612c.this.mo160828l();
                } catch (Exception unused3) {
                }
                throw th;
            }
        }
    }

    /* renamed from: me3.c$e */
    public interface C109620e {
        /* renamed from: a */
        boolean mo79171a(C112579f fVar);

        /* renamed from: b */
        void mo79172b();

        /* renamed from: c */
        void mo79173c(Boolean bool);
    }

    public C109612c() {
        C111167t tVar = C111167t.DEFAULT;
        this.f328173p = tVar;
        this.f328174q = tVar;
        this.f328175r = false;
        this.f328176s = null;
    }

    /* renamed from: a */
    public static void m148909a(C109612c cVar, boolean z) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(cVar.mo160819c(), C0966R.C0968anim.f2471dv);
            loadAnimation.setAnimationListener(new C109621d(cVar));
            cVar.f328158a.getRubbishView().startAnimation(loadAnimation);
            return;
        }
        if (cVar.f328158a.getConfig().f332924a != C111164r0.C111166b.VIDEO_COVER) {
            View rubbishView = cVar.f328158a.getRubbishView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.82f));
            C117292a.m165358d(rubbishView, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            rubbishView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(rubbishView, "com/tencent/mm/presenter/DrawingPresenter", "setRubbishViewVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(cVar.mo160819c(), C0966R.C0968anim.f2469dt);
        loadAnimation2.setAnimationListener(new C109622e(cVar));
        cVar.f328158a.getRubbishView().startAnimation(loadAnimation2);
    }

    /* renamed from: b */
    public <T extends C104085b> T mo160818b(C111167t tVar) {
        return (C104085b) this.f328160c.get(tVar);
    }

    /* renamed from: c */
    public Context mo160819c() {
        return this.f328158a.getContext();
    }

    /* renamed from: d */
    public <T extends C104085b> T mo160820d() {
        T t = this.f328176s;
        if (t != null) {
            return t;
        }
        Log.m105920e("MicroMsg.DrawingPresenter", "[getCurArtist] is null!");
        return C104085b.f307883n;
    }

    /* renamed from: e */
    public float mo160821e() {
        return this.f328158a.getBaseBoardView().getCurScale();
    }

    /* renamed from: f */
    public final Rect mo160822f(Bitmap bitmap, Rect rect) {
        Log.m105925i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", rect, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        if (rect.left < 0) {
            rect.left = 0;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        if (rect.bottom < 0) {
            rect.bottom = 0;
        }
        if (rect.right < 0) {
            rect.right = 0;
        }
        if (rect.bottom > bitmap.getHeight()) {
            rect.bottom = bitmap.getHeight();
        }
        if (rect.right > bitmap.getWidth()) {
            rect.right = bitmap.getWidth();
        }
        return rect;
    }

    /* renamed from: g */
    public List<IEmojiInfo> mo160823g() {
        ArrayList arrayList = new ArrayList();
        C104101k kVar = (C104101k) mo160818b(C111167t.EMOJI);
        if (kVar != null) {
            ArrayList arrayList2 = new ArrayList();
            C107547d dVar = (C107547d) kVar.mo145692c();
            if (dVar == null) {
                Log.m105928w("MicroMsg.EmojiAndTextArtist", "getCurrentEmojiList failed, cache is null!");
            } else {
                Stack<C112573c> stack = dVar.f321774d;
                ListIterator<C112573c> listIterator = stack.listIterator(stack.size());
                while (listIterator.hasPrevious()) {
                    IEmojiInfo iEmojiInfo = listIterator.previous().f337066f;
                    if (iEmojiInfo == null) {
                        Log.m105918d("MicroMsg.EmojiAndTextArtist", "getCurrentEmojiList: IEmojiInfo null, skip");
                    } else {
                        arrayList2.add(iEmojiInfo);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: h */
    public float mo160824h() {
        return this.f328158a.getBaseBoardView().getInitScale();
    }

    /* renamed from: i */
    public final Bitmap mo160825i(Bitmap bitmap, Rect rect, float f, BitmapFactory.Options options, Matrix matrix) {
        try {
            if (bitmap.getWidth() - rect.width() <= 9) {
                if (bitmap.getHeight() - rect.height() <= 9) {
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
            return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), matrix, true);
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace("MicroMsg.DrawingPresenter", e, "", new Object[0]);
            float f2 = 1920.0f / ((float) options.outHeight);
            float f3 = 1920.0f / ((float) options.outWidth);
            if (f2 <= f3) {
                f2 = f3;
            }
            matrix.reset();
            matrix.postScale(f2, f2, 0.0f, 0.0f);
            matrix.postRotate(-f);
            if (bitmap.getWidth() - rect.width() > 9 || bitmap.getHeight() - rect.height() > 9) {
                return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), matrix, true);
            }
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        if (r3 < 1280) goto L_0x00be;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160826j(p248ug.C111164r0.C111165a r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r0.f328159b = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f328160c = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.f328161d = r2
            r2 = 0
            r0.f328171n = r2
            java.lang.String r3 = r1.f332927d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r5 = 3
            r6 = 1
            r7 = 2
            java.lang.String r8 = "MicroMsg.DrawingPresenter"
            if (r4 != 0) goto L_0x0058
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 != 0) goto L_0x002b
            goto L_0x0058
        L_0x002b:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r4.inJustDecodeBounds = r6
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r3, r4)
            int r9 = r4.outWidth
            if (r9 <= 0) goto L_0x0040
            int r10 = r4.outHeight
            if (r10 > 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = 1
            goto L_0x0062
        L_0x0040:
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r2] = r9
            int r4 = r4.outHeight
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10[r6] = r4
            r10[r7] = r3
            java.lang.String r3 = "[checkImage] image err! w:%s h:%s path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r3, r10)
            goto L_0x0061
        L_0x0058:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r2] = r3
            java.lang.String r3 = "[checkImage] path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r3, r4)
        L_0x0061:
            r3 = 0
        L_0x0062:
            r4 = 0
            r9 = 1280(0x500, float:1.794E-42)
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r1.f332929f
            if (r3 == 0) goto L_0x0087
            java.lang.String r3 = r1.f332927d
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r3, r4)
            r0.f328163f = r3
            if (r3 == 0) goto L_0x0101
            java.lang.String r1 = r1.f332927d
            r9 = -1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.drawBackgroundInNeed(r3, r1, r9)
            android.graphics.Bitmap r1 = r0.f328163f
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = r1.copy(r3, r6)
            r0.f328163f = r1
            goto L_0x0101
        L_0x0087:
            java.lang.String r3 = r1.f332927d
            java.lang.String r10 = ""
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r3)
            if (r3 == 0) goto L_0x00be
            int r11 = r3.outWidth
            int r3 = r3.outHeight
            int r12 = r11 * r3
            r13 = 1638400(0x190000, float:2.295887E-39)
            double r13 = (double) r13
            double r4 = (double) r12
            double r13 = r13 / r4
            double r4 = java.lang.Math.sqrt(r13)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            double r11 = (double) r11
            double r11 = r11 * r4
            int r11 = (int) r11
            double r12 = (double) r3
            double r4 = r4 * r12
            int r3 = (int) r4
            if (r11 >= r9) goto L_0x00b8
            if (r3 >= r9) goto L_0x00b8
            goto L_0x00be
        L_0x00b8:
            r9 = r3
            r16 = r9
            r17 = r11
            goto L_0x00c2
        L_0x00be:
            r16 = 1280(0x500, float:1.794E-42)
            r17 = 1280(0x500, float:1.794E-42)
        L_0x00c2:
            java.lang.String r1 = r1.f332927d
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r10)
            r18 = 1
            r19 = 0
            r20 = -1
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r15, r16, r17, r18, r19, r20)
            r0.f328163f = r1
            goto L_0x0101
        L_0x00d5:
            ug.r0$b r3 = r1.f332924a
            ug.r0$b r4 = p248ug.C111164r0.C111166b.SCREEN
            if (r3 != r4) goto L_0x00f0
            int r3 = r1.f332931h
            android.graphics.Rect r4 = r1.f332930g
            int r4 = r4.width()
            android.graphics.Rect r1 = r1.f332930g
            int r1 = r1.height()
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r3, r4, r1)
            r0.f328163f = r1
            goto L_0x0101
        L_0x00f0:
            android.graphics.Bitmap r1 = r1.f332932i
            if (r1 == 0) goto L_0x00f7
            r0.f328163f = r1
            goto L_0x0101
        L_0x00f7:
            android.graphics.Bitmap r1 = r0.f328163f
            if (r1 != 0) goto L_0x0101
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r2, r9, r9)
            r0.f328163f = r1
        L_0x0101:
            java.util.LinkedList<bh.b> r1 = r0.f328161d
            r1.clear()
            java.util.HashMap<ug.t, bh.b> r1 = r0.f328160c
            r1.clear()
            java.util.HashMap<ug.t, bh.b> r1 = r0.f328160c
            ug.t r3 = p248ug.C111167t.DEFAULT
            bh.b r4 = p1093bh.C104085b.f307883n
            r1.put(r3, r4)
            com.tencent.mm.view.e r1 = r0.f328158a
            ug.t[] r1 = r1.getFeatures()
            int r3 = r1.length
            r4 = 0
        L_0x011c:
            if (r4 >= r3) goto L_0x01b3
            r5 = r1[r4]
            int r9 = r5.ordinal()
            if (r9 == r6) goto L_0x0176
            r10 = 3
            if (r9 == r7) goto L_0x0148
            if (r9 == r10) goto L_0x0148
            r11 = 4
            if (r9 == r11) goto L_0x0142
            r11 = 5
            if (r9 == r11) goto L_0x013c
            r11 = 7
            if (r9 == r11) goto L_0x0136
            r9 = 0
            goto L_0x017c
        L_0x0136:
            bh.l r9 = new bh.l
            r9.<init>()
            goto L_0x017c
        L_0x013c:
            bh.d r9 = new bh.d
            r9.<init>()
            goto L_0x017c
        L_0x0142:
            bh.p r9 = new bh.p
            r9.<init>()
            goto L_0x017c
        L_0x0148:
            java.util.LinkedList<bh.b> r9 = r0.f328161d
            java.util.Iterator r9 = r9.iterator()
        L_0x014e:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0165
            java.lang.Object r11 = r9.next()
            bh.b r11 = (p1093bh.C104085b) r11
            bh.a r12 = r11.mo145700k()
            bh.a r13 = p1093bh.C104084a.EMOJI_AND_TEXT
            if (r12 != r13) goto L_0x014e
            r9 = r11
            r11 = 1
            goto L_0x0167
        L_0x0165:
            r9 = 0
            r11 = 0
        L_0x0167:
            if (r11 != 0) goto L_0x017c
            bh.k r9 = new bh.k
            r9.<init>()
            me3.c$c r11 = new me3.c$c
            r11.<init>()
            r9.f307965F = r11
            goto L_0x017c
        L_0x0176:
            r10 = 3
            bh.j r9 = new bh.j
            r9.<init>()
        L_0x017c:
            if (r9 == 0) goto L_0x01af
            java.util.HashMap<ug.t, bh.b> r11 = r0.f328160c
            boolean r11 = r11.containsKey(r5)
            if (r11 != 0) goto L_0x018b
            java.util.HashMap<ug.t, bh.b> r11 = r0.f328160c
            r11.put(r5, r9)
        L_0x018b:
            java.util.LinkedList<bh.b> r5 = r0.f328161d
            boolean r5 = r5.contains(r9)
            if (r5 != 0) goto L_0x01af
            java.util.LinkedList<bh.b> r5 = r0.f328161d
            r5.add(r9)
            com.tencent.mm.view.e r5 = r0.f328158a
            cq3.a r5 = r5.getBaseBoardView()
            android.graphics.Matrix r5 = r5.getMainMatrix()
            com.tencent.mm.view.e r11 = r0.f328158a
            cq3.a r11 = r11.getBaseBoardView()
            android.graphics.Rect r11 = r11.getAliveRect()
            r9.mo145707r(r0, r5, r11)
        L_0x01af:
            int r4 = r4 + 1
            goto L_0x011c
        L_0x01b3:
            java.util.LinkedList<bh.b> r1 = r0.f328161d
            me3.b r3 = new me3.b
            r3.<init>(r0)
            java.util.Collections.sort(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.util.HashMap<ug.t, bh.b> r3 = r0.f328160c
            int r3 = r3.size()
            int r3 = r3 - r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "[addArtists] count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me3.C109612c.mo160826j(ug.r0$a):void");
    }

    /* renamed from: k */
    public boolean mo160827k() {
        return mo160820d().mo145700k() != C104084a.CROP_PHOTO && this.f328164g;
    }

    /* renamed from: l */
    public void mo160828l() {
        Iterator<C104085b> it = this.f328161d.iterator();
        while (it.hasNext()) {
            it.next().mo145709t();
        }
        this.f328161d.clear();
        this.f328160c.clear();
    }

    /* renamed from: m */
    public void mo160829m(Canvas canvas) {
        Iterator<C104085b> it = this.f328161d.iterator();
        while (it.hasNext()) {
            C104085b next = it.next();
            if (next.f307888e && next.f307887d) {
                if (mo160820d().mo145700k() == next.mo145700k()) {
                    next.mo145711v(canvas);
                } else {
                    canvas.save();
                    canvas.clipRect(this.f328158a.getBaseBoardView().getAliveRect());
                    next.mo145708s(canvas);
                    canvas.restore();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo160830n(IEmojiInfo iEmojiInfo) {
        C104101k kVar = (C104101k) mo160818b(C111167t.EMOJI);
        if (kVar != null) {
            Log.m105925i("MicroMsg.EmojiAndTextArtist", "[addEmojiItem] item:%s", iEmojiInfo);
            C107547d dVar = (C107547d) kVar.mo145692c();
            if (dVar == null) {
                Log.m105928w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                return;
            }
            kVar.mo145742F();
            kVar.mo145741E();
            kVar.mo145688A(false);
            Rect b = kVar.mo145691b();
            Context context = MMApplicationContext.getContext();
            Matrix g = kVar.mo145696g();
            C112573c cVar = new C112573c(context, g, dVar.mo157975D1(true) + "", iEmojiInfo, b);
            cVar.f337073p = true;
            float[] a = kVar.mo145690a((float) b.centerX(), (float) b.centerY());
            cVar.mo164307b(a[0], a[1], ((C109612c) kVar.f307884a).mo160824h() / ((C109612c) kVar.f307884a).mo160821e(), (int) kVar.mo145697h());
            Stack<C112573c> stack = dVar.f321774d;
            if (stack != null) {
                stack.push(cVar);
            }
            kVar.mo145704o();
            kVar.mo145740D();
        }
    }

    /* renamed from: o */
    public void mo160831o(String str, int i, int i2, String str2, boolean z, float f, boolean z2, boolean z3, int i3) {
        String str3 = str;
        boolean z4 = z;
        float f2 = f;
        boolean z5 = z2;
        boolean z6 = z3;
        int i4 = i3;
        Class cls = C76979h.class;
        if (!TextUtils.isEmpty(str)) {
            mo160834r(false);
            this.f328158a.setFooterVisible(true);
            C104085b d = mo160820d();
            if (d.mo145700k() == C104084a.EMOJI_AND_TEXT) {
                C104101k kVar = (C104101k) d;
                EditText editText = (EditText) this.f328158a.getTextEditView().findViewById(C0966R.C0970id.ki7);
                if (editText.getTag() == null || !(editText.getTag() instanceof C112579f)) {
                    SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(mo160819c(), str3);
                    Log.m105925i("MicroMsg.EmojiAndTextArtist", "[addItem] text:%s", T1);
                    if (!Util.isNullOrNil((CharSequence) T1)) {
                        C107547d dVar = (C107547d) kVar.mo145692c();
                        if (dVar == null) {
                            Log.m105928w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                        } else {
                            kVar.mo145742F();
                            kVar.mo145741E();
                            kVar.mo145688A(false);
                            Rect b = kVar.mo145691b();
                            Context context = MMApplicationContext.getContext();
                            Matrix g = kVar.mo145696g();
                            C112579f fVar = new C112579f(context, g, dVar.mo157975D1(true) + "", b, T1, i, i2, str2);
                            fVar.mo164319m(true);
                            fVar.f337104A = z4;
                            fVar.f337077t = true;
                            fVar.f337105B = z5;
                            fVar.f337078u = z6;
                            fVar.f337109F = i4;
                            if (f2 != 0.0f) {
                                fVar.f337108E = f2;
                            }
                            float[] a = kVar.mo145690a((float) b.centerX(), (float) b.centerY());
                            fVar.mo164307b(a[0], a[1], ((C109612c) kVar.f307884a).mo160824h() / ((C109612c) kVar.f307884a).mo160821e(), (int) kVar.mo145697h());
                            Stack<C112573c> stack = dVar.f321774d;
                            if (stack != null) {
                                stack.push(fVar);
                            }
                            kVar.mo145704o();
                            kVar.mo145740D();
                        }
                    }
                } else {
                    C112579f fVar2 = (C112579f) editText.getTag();
                    SpannableString T12 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(mo160819c(), str3);
                    C107547d dVar2 = (C107547d) kVar.mo145692c();
                    if (dVar2 == null) {
                        Log.m105928w("MicroMsg.EmojiAndTextArtist", "cache is null!");
                    } else {
                        String str4 = fVar2.f337065e;
                        Log.m105925i("MicroMsg.EmojiAndTextCache", "[delete] id:%s", str4);
                        Stack<C112573c> stack2 = dVar2.f321774d;
                        if (stack2 != null && stack2.size() > 0) {
                            C112573c peek = dVar2.f321774d.peek();
                            if (peek.f337065e.equalsIgnoreCase(str4)) {
                                dVar2.f321774d.pop();
                            } else {
                                Log.m105921e("MicroMsg.EmojiAndTextCache", "[delete] id:%s emojiItem:%s", str4, peek);
                            }
                        }
                        fVar2.mo164319m(true);
                        fVar2.f337104A = z4;
                        fVar2.f337077t = true;
                        fVar2.f337078u = z6;
                        fVar2.f337109F = i4;
                        kVar.mo145742F();
                        kVar.mo145741E();
                        kVar.mo145688A(true);
                        if (!Util.isNullOrNil((CharSequence) T12)) {
                            Rect b2 = kVar.mo145691b();
                            Context context2 = MMApplicationContext.getContext();
                            Matrix g2 = kVar.mo145696g();
                            C112579f fVar3 = new C112579f(context2, g2, dVar2.mo157975D1(true) + "", b2, T12, i, i2, str2);
                            fVar3.mo164319m(true);
                            fVar3.f337104A = z4;
                            fVar3.f337105B = z5;
                            fVar3.f337078u = z6;
                            fVar3.f337109F = i4;
                            if (f2 != 0.0f) {
                                fVar3.f337108E = f2;
                            }
                            PointF pointF = fVar2.f337069i;
                            fVar3.mo164307b(pointF.x, pointF.y, ((C109612c) kVar.f307884a).mo160824h() / ((C109612c) kVar.f307884a).mo160821e(), fVar2.f337070j);
                            fVar3.f337071n = fVar2.f337071n;
                            Stack<C112573c> stack3 = dVar2.f321774d;
                            if (stack3 != null) {
                                stack3.push(fVar3);
                            }
                        }
                        kVar.mo145704o();
                        kVar.mo145740D();
                    }
                }
                editText.setTag((Object) null);
            }
        }
    }

    /* renamed from: p */
    public boolean mo160832p(MotionEvent motionEvent) {
        boolean z;
        C109623f.C109624a aVar;
        C104084a aVar2 = C104084a.CROP_PHOTO;
        if (mo160820d().mo145700k() == aVar2 || mo160820d().mo145700k() == C104084a.CROP_VIDEO) {
            z = false;
        } else {
            C104085b bVar = null;
            HashMap<C111167t, C104085b> hashMap = this.f328160c;
            C111167t tVar = C111167t.TEXT;
            if (hashMap.containsKey(tVar)) {
                bVar = this.f328160c.get(tVar);
            } else {
                HashMap<C111167t, C104085b> hashMap2 = this.f328160c;
                C111167t tVar2 = C111167t.EMOJI;
                if (hashMap2.containsKey(tVar2)) {
                    bVar = this.f328160c.get(tVar2);
                }
            }
            z = bVar != null ? bVar.mo145710u(motionEvent) : false;
            if (z) {
                this.f328176s = bVar;
            }
        }
        if (!z) {
            this.f328176s = this.f328160c.get(this.f328158a.getBaseFooterView().getCurFeatureType());
            Iterator<C104085b> it = this.f328161d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C104085b next = it.next();
                if (next.mo145700k() != C104084a.EMOJI_AND_TEXT && next.mo145710u(motionEvent)) {
                    z = true;
                    break;
                }
            }
            if (!z && (aVar = this.f328170m) != null) {
                aVar.mo151262a(motionEvent);
            }
        }
        if (mo160820d().mo145700k() == aVar2) {
            C104090d dVar = (C104090d) mo160820d();
            if (this.f328167j) {
                if (motionEvent.getAction() == 0) {
                    dVar.f307899A = true;
                } else if (motionEvent.getAction() == 1) {
                    dVar.f307899A = false;
                }
            }
        }
        return z;
    }

    /* renamed from: q */
    public void mo160833q(int i, int i2) {
        Log.m105925i("MicroMsg.DrawingPresenter", "setOutputSize width:%d height:%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f328168k = i;
        this.f328169l = i2;
    }

    /* renamed from: r */
    public final void mo160834r(boolean z) {
        if (z) {
            View textEditView = this.f328158a.getTextEditView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(textEditView, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textEditView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(textEditView, "com/tencent/mm/presenter/DrawingPresenter", "setTextEditViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Animation loadAnimation = AnimationUtils.loadAnimation(mo160819c(), C0966R.C0968anim.f2471dv);
            loadAnimation.setAnimationListener(new C109613a());
            this.f328158a.getTextEditView().startAnimation(loadAnimation);
            return;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(mo160819c(), C0966R.C0968anim.f2469dt);
        loadAnimation2.setAnimationListener(new C109615b());
        this.f328158a.getTextEditView().startAnimation(loadAnimation2);
    }
}
