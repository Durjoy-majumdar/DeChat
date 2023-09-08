package com.tencent.p014mm.p136ui.tools;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.CropImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C34861g1;
import nj3.C76874e0;
import p823sg.C90193h;
import qo3.C77407n;
import sf0.C77702q0;

@Deprecated
/* renamed from: com.tencent.mm.ui.tools.CropImageNewUI */
public class CropImageNewUI extends MMActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f348463t = 0;

    /* renamed from: d */
    public int f348464d;

    /* renamed from: e */
    public int f348465e = 0;

    /* renamed from: f */
    public FilterImageView f348466f;

    /* renamed from: g */
    public LinearLayout f348467g;

    /* renamed from: h */
    public CropImageView f348468h;

    /* renamed from: i */
    public ImageView f348469i;

    /* renamed from: j */
    public View f348470j;

    /* renamed from: n */
    public int f348471n = 0;

    /* renamed from: o */
    public String f348472o;

    /* renamed from: p */
    public boolean f348473p = false;

    /* renamed from: q */
    public boolean f348474q = false;

    /* renamed from: r */
    public boolean f348475r = false;

    /* renamed from: s */
    public int f348476s = 0;

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$a */
    public class C116114a implements Runnable {
        public C116114a() {
        }

        public void run() {
            if (CropImageNewUI.m163402H7(CropImageNewUI.this)) {
                CropImageNewUI cropImageNewUI = CropImageNewUI.this;
                if (cropImageNewUI.f348473p || cropImageNewUI.f348474q || !cropImageNewUI.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
                    CropImageNewUI cropImageNewUI2 = CropImageNewUI.this;
                    if (1 == cropImageNewUI2.f348464d) {
                        cropImageNewUI2.f348466f.mo177455c(cropImageNewUI2.f348472o, cropImageNewUI2.f348471n);
                        cropImageNewUI2.f348467g.setVisibility(8);
                        cropImageNewUI2.f348466f.setVisibility(0);
                        ImageView imageView = cropImageNewUI2.f348469i;
                        imageView.setTag(Integer.valueOf(imageView.getVisibility()));
                        cropImageNewUI2.f348469i.setVisibility(8);
                        cropImageNewUI2.f348468h.setVisibility(8);
                        View findViewById = cropImageNewUI2.f348466f.findViewById(C0966R.C0970id.bww);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                CropImageNewUI cropImageNewUI3 = CropImageNewUI.this;
                if (cropImageNewUI3.f348466f.getFilterBmp() == null) {
                    cropImageNewUI3.f348466f.mo177455c(cropImageNewUI3.f348472o, cropImageNewUI3.f348471n);
                }
                cropImageNewUI3.f348467g.setVisibility(8);
                cropImageNewUI3.f348466f.setVisibility(0);
                ImageView imageView2 = cropImageNewUI3.f348469i;
                imageView2.setTag(Integer.valueOf(imageView2.getVisibility()));
                cropImageNewUI3.f348469i.setVisibility(8);
                cropImageNewUI3.f348468h.setVisibility(8);
                if (!CropImageNewUI.this.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("CropImage_Filter_Show", true)) {
                    View findViewById2 = CropImageNewUI.this.f348466f.findViewById(C0966R.C0970id.bww);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$b */
    public class C116115b implements CropImageView.C116127d {
        public C116115b() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$c */
    public class C116116c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f348479d;

        /* renamed from: e */
        public final /* synthetic */ boolean f348480e;

        public C116116c(boolean z, boolean z2) {
            this.f348479d = z;
            this.f348480e = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r18) {
            /*
                r17 = this;
                r1 = r17
                boolean r0 = r1.f348479d
                r2 = 1
                if (r0 == 0) goto L_0x0011
                boolean r0 = r1.f348480e
                if (r0 == 0) goto L_0x0011
                com.tencent.mm.ui.tools.CropImageNewUI r0 = com.tencent.p014mm.p136ui.tools.CropImageNewUI.this
                com.tencent.p014mm.p136ui.tools.CropImageNewUI.m163404J7(r0, r2)
                return r2
            L_0x0011:
                com.tencent.mm.ui.tools.CropImageNewUI r3 = com.tencent.p014mm.p136ui.tools.CropImageNewUI.this
                int r0 = r3.f348464d
                if (r0 == r2) goto L_0x0298
                java.lang.String r4 = "CropImage_filterId"
                java.lang.String r6 = "MicroMsg.CropImageUI"
                r7 = 4
                r8 = 3
                r9 = 0
                r10 = 2
                if (r0 == r10) goto L_0x019a
                if (r0 == r8) goto L_0x007a
                if (r0 == r7) goto L_0x004d
                r4 = 5
                if (r0 == r4) goto L_0x002a
                goto L_0x02b0
            L_0x002a:
                java.lang.String[] r5 = new java.lang.String[r10]
                r0 = 2131834852(0x7f1137e4, float:1.9302826E38)
                java.lang.String r0 = r3.getString(r0)
                r5[r9] = r0
                r0 = 2131835159(0x7f113917, float:1.9303449E38)
                java.lang.String r0 = r3.getString(r0)
                r5[r2] = r0
                com.tencent.mm.ui.tools.e0 r8 = new com.tencent.mm.ui.tools.e0
                r8.<init>(r3)
                r7 = 0
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                nj3.C76879j.m92737h(r3, r4, r5, r6, r7, r8)
                goto L_0x02b0
            L_0x004d:
                boolean r0 = r3.f348473p
                r4 = 2131824507(0x7f110f7b, float:1.9281844E38)
                if (r0 != 0) goto L_0x0062
                boolean r0 = r3.f348474q
                if (r0 == 0) goto L_0x0059
                goto L_0x0062
            L_0x0059:
                java.lang.String[] r0 = new java.lang.String[r2]
                java.lang.String r4 = r3.getString(r4)
                r0[r9] = r4
                goto L_0x006a
            L_0x0062:
                java.lang.String[] r0 = new java.lang.String[r2]
                java.lang.String r4 = r3.getString(r4)
                r0[r9] = r4
            L_0x006a:
                r5 = r0
                r7 = 0
                com.tencent.mm.ui.tools.f0 r8 = new com.tencent.mm.ui.tools.f0
                r8.<init>(r3)
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                nj3.C76879j.m92737h(r3, r4, r5, r6, r7, r8)
                goto L_0x02b0
            L_0x007a:
                java.lang.String r7 = ""
                android.content.Intent r0 = r3.getIntent()
                java.lang.String r8 = "CropImage_OutputPath"
                java.lang.String r10 = r0.getStringExtra(r8)
                android.content.Intent r11 = new android.content.Intent
                r11.<init>()
                int r0 = r3.f348465e
                java.lang.String r12 = "emoji_type"
                java.lang.String r13 = "file is exist. need no to copy!"
                if (r0 != 0) goto L_0x0135
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0129 }
                r0.<init>()     // Catch:{ IOException -> 0x0129 }
                r0.append(r7)     // Catch:{ IOException -> 0x0129 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0129 }
                r0.append(r14)     // Catch:{ IOException -> 0x0129 }
                java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0129 }
                byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x0129 }
                java.lang.String r0 = p823sg.C90193h.m112878f(r0)     // Catch:{ IOException -> 0x0129 }
                com.tencent.mm.ui.tools.CropImageView r14 = r3.f348468h     // Catch:{ IOException -> 0x0129 }
                android.graphics.Bitmap r14 = r14.getBmp()     // Catch:{ IOException -> 0x0129 }
                r15 = 100
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0129 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0129 }
                r2.<init>()     // Catch:{ IOException -> 0x0129 }
                r2.append(r10)     // Catch:{ IOException -> 0x0129 }
                r2.append(r0)     // Catch:{ IOException -> 0x0129 }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0129 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r14, r15, r5, r2, r9)     // Catch:{ IOException -> 0x0129 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0129 }
                r2.<init>()     // Catch:{ IOException -> 0x0129 }
                r2.append(r10)     // Catch:{ IOException -> 0x0129 }
                r2.append(r0)     // Catch:{ IOException -> 0x0129 }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0129 }
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)     // Catch:{ IOException -> 0x0129 }
                int r2 = (int) r14     // Catch:{ IOException -> 0x0129 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0129 }
                r5.<init>()     // Catch:{ IOException -> 0x0129 }
                r5.append(r10)     // Catch:{ IOException -> 0x0129 }
                r5.append(r0)     // Catch:{ IOException -> 0x0129 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0129 }
                byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r9, r2)     // Catch:{ IOException -> 0x0129 }
                java.lang.String r14 = p823sg.C90193h.m112878f(r2)     // Catch:{ IOException -> 0x0129 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0127 }
                r2.<init>()     // Catch:{ IOException -> 0x0127 }
                r2.append(r10)     // Catch:{ IOException -> 0x0127 }
                r2.append(r14)     // Catch:{ IOException -> 0x0127 }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0127 }
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ IOException -> 0x0127 }
                if (r2 != 0) goto L_0x010e
                com.tencent.p014mm.vfs.C86013q1.m106435Q(r10, r0, r14)     // Catch:{ IOException -> 0x0127 }
                goto L_0x0123
            L_0x010e:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)     // Catch:{ IOException -> 0x0127 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0127 }
                r2.<init>()     // Catch:{ IOException -> 0x0127 }
                r2.append(r10)     // Catch:{ IOException -> 0x0127 }
                r2.append(r0)     // Catch:{ IOException -> 0x0127 }
                java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0127 }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ IOException -> 0x0127 }
            L_0x0123:
                r11.putExtra(r12, r9)     // Catch:{ IOException -> 0x0127 }
                goto L_0x0174
            L_0x0127:
                r0 = move-exception
                goto L_0x012b
            L_0x0129:
                r0 = move-exception
                r14 = 0
            L_0x012b:
                java.lang.Object[] r2 = new java.lang.Object[r9]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r2)
                r0 = -2
                r3.setResult(r0)
                goto L_0x0174
            L_0x0135:
                if (r0 != r2) goto L_0x0173
                java.lang.String r0 = r3.f348472o
                r2 = -1
                byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r9, r2)
                java.lang.String r14 = p823sg.C90193h.m112878f(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r10)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                if (r2 != 0) goto L_0x016b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r10)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                int r5 = r0.length
                com.tencent.p014mm.vfs.C86013q1.m106438T(r2, r0, r9, r5)
                goto L_0x016e
            L_0x016b:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            L_0x016e:
                r2 = 1
                r11.putExtra(r12, r2)
                goto L_0x0174
            L_0x0173:
                r14 = 0
            L_0x0174:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r11.putExtra(r8, r0)
                com.tencent.mm.ui.tools.FilterImageView r0 = r3.f348466f
                if (r0 == 0) goto L_0x0191
                int r0 = r0.getFilterId()
                r11.putExtra(r4, r0)
            L_0x0191:
                r2 = -1
                r3.setResult(r2, r11)
                r3.finish()
                goto L_0x0296
            L_0x019a:
                r3.getClass()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                android.view.Window r2 = r3.getWindow()
                android.view.View r2 = r2.getDecorView()
                r2.getWindowVisibleDisplayFrame(r0)
                int r0 = r0.top
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "window TitleBar.h:"
                r2.append(r5)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r2)
                if (r0 != 0) goto L_0x01cd
                androidx.appcompat.app.AppCompatActivity r0 = r3.getContext()
                int r0 = p206nj.C47264o.m52556a(r0, r9)
            L_0x01cd:
                android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
                r2.<init>()
                java.lang.String r5 = "window"
                java.lang.Object r5 = r3.getSystemService(r5)
                android.view.WindowManager r5 = (android.view.WindowManager) r5
                android.view.Display r5 = r5.getDefaultDisplay()
                r5.getMetrics(r2)
                r5 = 1116078080(0x42860000, float:67.0)
                float r2 = r2.density
                float r2 = r2 * r5
                double r11 = (double) r2
                r13 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                double r11 = r11 / r13
                int r2 = (int) r11
                android.view.View r5 = r3.f348470j
                int r5 = r5.getWidth()
                android.view.View r11 = r3.f348470j
                int r11 = r11.getHeight()
                int r5 = java.lang.Math.min(r5, r11)
                android.view.View r11 = r3.f348470j
                int r11 = r11.getWidth()
                android.view.View r12 = r3.f348470j
                int r12 = r12.getHeight()
                int r11 = java.lang.Math.max(r11, r12)
                int r12 = r2 * 2
                int r13 = r11 - r12
                int r11 = r11 + r0
                int r11 = r11 + r2
                int r14 = r5 - r12
                int r14 = r14 - r0
                int r15 = r3.f348471n
                if (r15 != 0) goto L_0x021c
                int r12 = r12 + r0
                int r5 = r5 + r12
                int r14 = r14 + r2
            L_0x021c:
                int[] r0 = new int[r7]
                r0[r9] = r5
                r2 = 1
                r0[r2] = r13
                r0[r10] = r14
                r0[r8] = r11
                android.graphics.Bitmap r5 = r3.mo177433L7(r14, r11)
                r7 = r0[r9]
                r0 = r0[r2]
                android.graphics.Bitmap r0 = r3.mo177433L7(r7, r0)
                int r2 = r3.f348471n
                if (r2 != 0) goto L_0x0238
                goto L_0x023d
            L_0x0238:
                r16 = r5
                r5 = r0
                r0 = r16
            L_0x023d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "docrop degree:"
                r2.append(r7)
                int r7 = r3.f348471n
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
                android.content.Intent r2 = r3.getIntent()
                java.lang.String r6 = "CropImage_bg_vertical"
                java.lang.String r2 = r2.getStringExtra(r6)
                android.content.Intent r7 = r3.getIntent()
                java.lang.String r8 = "CropImage_bg_horizontal"
                java.lang.String r7 = r7.getStringExtra(r8)
                r9 = 1
                boolean r5 = r3.mo177434M7(r5, r2, r9)
                if (r5 == 0) goto L_0x028f
                boolean r0 = r3.mo177434M7(r0, r7, r9)
                if (r0 == 0) goto L_0x028f
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.putExtra(r6, r2)
                r0.putExtra(r8, r7)
                com.tencent.mm.ui.tools.FilterImageView r2 = r3.f348466f
                if (r2 == 0) goto L_0x028a
                int r2 = r2.getFilterId()
                r0.putExtra(r4, r2)
            L_0x028a:
                r2 = -1
                r3.setResult(r2, r0)
                goto L_0x0293
            L_0x028f:
                r2 = -1
                r3.setResult(r2)
            L_0x0293:
                r3.finish()
            L_0x0296:
                r2 = 1
                goto L_0x02b0
            L_0x0298:
                com.tencent.mm.ui.tools.FilterImageView r0 = r3.f348466f
                if (r0 == 0) goto L_0x02a8
                com.tencent.mm.ui.tools.CropImageView r0 = r0.getCropImageIV()
                com.tencent.mm.ui.tools.CropImageNewUI r2 = com.tencent.p014mm.p136ui.tools.CropImageNewUI.this
                android.view.View r2 = r2.f348470j
                com.tencent.p014mm.p136ui.tools.CropImageNewUI.m163403I7(r3, r0, r2)
                goto L_0x0296
            L_0x02a8:
                com.tencent.mm.ui.tools.CropImageView r0 = r3.f348468h
                android.view.View r2 = r3.f348470j
                com.tencent.p014mm.p136ui.tools.CropImageNewUI.m163403I7(r3, r0, r2)
                goto L_0x0296
            L_0x02b0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.CropImageNewUI.C116116c.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$d */
    public class C116117d implements View.OnClickListener {
        public C116117d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CropImageNewUI.m163404J7(CropImageNewUI.this, true);
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/CropImageNewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$e */
    public class C116118e implements MenuItem.OnMenuItemClickListener {
        public C116118e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CropImageNewUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$f */
    public class C116119f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$f$a */
        public class C116120a implements C11182m0 {
            public C116120a(C116119f fVar) {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(0, C0966R.string.bwj);
                e0Var.mo107125a(1, C0966R.string.bwn);
            }
        }

        /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$f$b */
        public class C116121b implements C11184p0 {
            public C116121b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("CropImage_OutputPath", CropImageNewUI.this.getIntent().getStringExtra("CropImage_OutputPath"));
                    intent.putExtra("OP_CODE", 1);
                    CropImageNewUI.this.setResult(-1, intent);
                    CropImageNewUI.this.finish();
                } else if (itemId == 1) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("CropImage_OutputPath", CropImageNewUI.this.getIntent().getStringExtra("CropImage_OutputPath"));
                    intent2.putExtra("OP_CODE", 2);
                    CropImageNewUI.this.setResult(-1, intent2);
                    CropImageNewUI.this.finish();
                }
            }
        }

        public C116119f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) CropImageNewUI.this, 1, false);
            nVar.f225771i = new C116120a(this);
            nVar.f225782p = new C116121b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.CropImageNewUI$g */
    public class C116122g implements Runnable {
        public C116122g() {
        }

        public void run() {
            CropImageNewUI.m163402H7(CropImageNewUI.this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x051e  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m163402H7(com.tencent.p014mm.p136ui.tools.CropImageNewUI r26) {
        /*
            r0 = r26
            int r1 = r0.f348464d
            r2 = 1
            if (r2 != r1) goto L_0x0018
            com.tencent.mm.ui.tools.FilterImageView r1 = r0.f348466f
            if (r1 == 0) goto L_0x0010
            android.view.View r1 = r1.getCropAreaView()
            goto L_0x001f
        L_0x0010:
            r1 = 2131300602(0x7f0910fa, float:1.8219238E38)
            android.view.View r1 = r0.findViewById(r1)
            goto L_0x001f
        L_0x0018:
            r1 = 2131300601(0x7f0910f9, float:1.8219236E38)
            android.view.View r1 = r0.findViewById(r1)
        L_0x001f:
            r3 = 0
            if (r1 != 0) goto L_0x0025
        L_0x0022:
            r2 = 0
            goto L_0x05c5
        L_0x0025:
            int r4 = r1.getWidth()
            int r5 = r1.getHeight()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "scrWidth:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " scrHeight:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.CropImageUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            android.content.Intent r6 = r26.getIntent()
            java.lang.String r8 = "CropImage_ImgPath"
            java.lang.String r6 = r6.getStringExtra(r8)
            r0.f348472o = r6
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 != 0) goto L_0x0061
            r26.finish()
            goto L_0x0022
        L_0x0061:
            int r6 = r0.f348464d
            r8 = 3
            r9 = 8
            r12 = 2
            if (r6 != r12) goto L_0x006e
            r10 = r4
            r15 = r5
            r6 = 1
            goto L_0x01b4
        L_0x006e:
            r15 = 960(0x3c0, float:1.345E-42)
            if (r6 != r8) goto L_0x00e6
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            r6.inJustDecodeBounds = r2
            java.lang.String r11 = r0.f348472o
            android.graphics.Bitmap r11 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r11, r6)
            if (r11 == 0) goto L_0x0084
            r11.recycle()
        L_0x0084:
            int r11 = r6.outWidth
            int r6 = r6.outHeight
            r10 = 640(0x280, float:8.97E-43)
            if (r11 > r10) goto L_0x0094
            if (r6 <= r10) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r15 = r6
            r10 = r11
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00af
        L_0x0094:
            if (r11 <= r6) goto L_0x00a1
            float r15 = (float) r6
            float r10 = (float) r11
            float r10 = r15 / r10
            float r15 = r15 * r10
            int r15 = (int) r15
            r13 = r10
            r10 = 640(0x280, float:8.97E-43)
            goto L_0x00af
        L_0x00a1:
            float r10 = (float) r11
            float r13 = (float) r6
            float r10 = r10 / r13
            float r13 = (float) r15
            float r13 = r13 * r10
            int r13 = (int) r13
            r15 = 640(0x280, float:8.97E-43)
            r25 = r13
            r13 = r10
            r10 = r25
        L_0x00af:
            r14 = 5
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r3] = r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r14[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r14[r8] = r6
            r6 = 4
            java.lang.Float r11 = java.lang.Float.valueOf(r13)
            r14[r6] = r11
            java.lang.String r6 = "w:%d h:%d width:%d height:%d scale:%f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r14)
            r6 = 2131300604(0x7f0910fc, float:1.8219242E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto L_0x01b3
            r6.setVisibility(r9)
            goto L_0x01b3
        L_0x00e6:
            java.lang.String r10 = "recycle bitmap:%s"
            r11 = 1920(0x780, float:2.69E-42)
            if (r6 != r2) goto L_0x0136
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            r6.inJustDecodeBounds = r2
            java.lang.String r13 = r0.f348472o
            android.graphics.Bitmap r13 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r13, r6)
            if (r13 == 0) goto L_0x0109
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r18 = r13.toString()
            r14[r3] = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r14)
            r13.recycle()
        L_0x0109:
            int r10 = r6.outWidth
            int r6 = r6.outHeight
            if (r10 <= r6) goto L_0x0126
            int r10 = r10 * 960
            double r13 = (double) r10
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 * r18
            double r9 = (double) r6
            double r13 = r13 / r9
            int r6 = (int) r13
            if (r6 <= r11) goto L_0x0121
            r6 = 960(0x3c0, float:1.345E-42)
            r15 = 1920(0x780, float:2.69E-42)
            goto L_0x01b1
        L_0x0121:
            r15 = r6
            r6 = 960(0x3c0, float:1.345E-42)
            goto L_0x01b1
        L_0x0126:
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = r6 * 960
            double r13 = (double) r6
            double r13 = r13 * r18
            double r9 = (double) r10
            double r13 = r13 / r9
            int r6 = (int) r13
            if (r6 <= r11) goto L_0x01b1
            r6 = 1920(0x780, float:2.69E-42)
            goto L_0x01b1
        L_0x0136:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            r6.inJustDecodeBounds = r2
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r6)
            java.lang.String r9 = r0.f348472o
            android.graphics.Bitmap r9 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r9, r6)
            if (r9 == 0) goto L_0x0156
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r13 = r9.toString()
            r11[r3] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r11)
            r9.recycle()
        L_0x0156:
            int r9 = r6.outWidth
            int r6 = r6.outHeight
            int r10 = sf0.C77702q0.f226484a
            double r10 = (double) r9
            double r13 = (double) r6
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r23 = r13 * r21
            int r18 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r18 <= 0) goto L_0x0169
            r18 = 1
            goto L_0x016b
        L_0x0169:
            r18 = 0
        L_0x016b:
            if (r18 == 0) goto L_0x0173
            r15 = 480(0x1e0, float:6.73E-43)
            if (r9 <= r15) goto L_0x0173
            r15 = 1
            goto L_0x0174
        L_0x0173:
            r15 = 0
        L_0x0174:
            r0.f348473p = r15
            double r10 = r10 * r21
            int r21 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r21 <= 0) goto L_0x017e
            r10 = 1
            goto L_0x017f
        L_0x017e:
            r10 = 0
        L_0x017f:
            if (r10 == 0) goto L_0x0187
            r10 = 480(0x1e0, float:6.73E-43)
            if (r6 <= r10) goto L_0x0187
            r10 = 1
            goto L_0x0188
        L_0x0187:
            r10 = 0
        L_0x0188:
            r0.f348474q = r10
            if (r15 != 0) goto L_0x0194
            if (r10 == 0) goto L_0x018f
            goto L_0x0194
        L_0x018f:
            r6 = 960(0x3c0, float:1.345E-42)
            r15 = 960(0x3c0, float:1.345E-42)
            goto L_0x0195
        L_0x0194:
            r15 = r9
        L_0x0195:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "width is "
            r9.append(r10)
            r9.append(r15)
            java.lang.String r10 = " height is "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
        L_0x01b1:
            r10 = r15
            r15 = r6
        L_0x01b3:
            r6 = 0
        L_0x01b4:
            java.lang.String r9 = r0.f348472o
            int r9 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r9)
            r0.f348471n = r9
            r11 = 90
            if (r9 == r11) goto L_0x01ca
            r11 = 270(0x10e, float:3.78E-43)
            if (r9 != r11) goto L_0x01c5
            goto L_0x01ca
        L_0x01c5:
            r25 = r15
            r15 = r10
            r10 = r25
        L_0x01ca:
            java.lang.String r9 = r0.f348472o
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r9, r10, r15, r6)
            java.lang.String r10 = r0.f348472o
            r11 = 10
            byte[] r10 = com.tencent.p014mm.vfs.C86013q1.m106433O(r10, r3, r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((byte[]) r10)
            if (r11 == 0) goto L_0x01e1
            r0.f348465e = r2
            goto L_0x01e3
        L_0x01e1:
            r0.f348465e = r3
        L_0x01e3:
            if (r9 != 0) goto L_0x01ea
            r26.finish()
            goto L_0x0022
        L_0x01ea:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "h:"
            r11.append(r13)
            int r13 = r9.getHeight()
            r11.append(r13)
            java.lang.String r13 = "w: "
            r11.append(r13)
            int r13 = r9.getWidth()
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "temBmp crop"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r11)
            int r11 = r0.f348471n
            float r11 = (float) r11
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r9, r11)
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            r11.reset()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0259
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r6 = (float) r4
            float r1 = r1 / r6
            int r14 = r9.getHeight()
            float r14 = (float) r14
            float r15 = (float) r5
            float r14 = r14 / r15
            int r16 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r1 = r14
        L_0x0237:
            if (r4 <= r5) goto L_0x023a
            r6 = r15
        L_0x023a:
            int r14 = r9.getWidth()
            float r14 = (float) r14
            float r14 = r6 / r14
            int r15 = r9.getHeight()
            float r15 = (float) r15
            float r6 = r6 / r15
            int r15 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x024c
            goto L_0x024d
        L_0x024c:
            r14 = r6
        L_0x024d:
            double r2 = (double) r1
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x02ed
            r11.postScale(r14, r14)
            goto L_0x02ed
        L_0x0259:
            int r2 = r9.getWidth()
            float r2 = (float) r2
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r9.getHeight()
            float r3 = (float) r3
            int r14 = r9.getWidth()
            float r14 = (float) r14
            float r3 = r3 / r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r6 = "whDiv is "
            r14.append(r6)
            r14.append(r2)
            java.lang.String r6 = " hwDiv is "
            r14.append(r6)
            r14.append(r3)
            java.lang.String r6 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            r14 = 0
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x031b
            int r3 = r9.getHeight()
            r6 = 480(0x1e0, float:6.73E-43)
            if (r3 < r6) goto L_0x031b
            int r2 = r9.getWidth()
            float r2 = (float) r2
            float r3 = (float) r4
            float r2 = r2 / r3
            int r6 = r9.getWidth()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r15 = r0.f348464d
            r12 = 1
            if (r12 != r15) goto L_0x02d3
            r12 = r6
            float r2 = (float) r5
            int r14 = r9.getHeight()
            float r14 = (float) r14
            float r2 = r2 / r14
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x02b8
            r2 = r12
        L_0x02b8:
            r11.postScale(r2, r2)
            int r12 = r9.getWidth()
            float r12 = (float) r12
            float r12 = r12 * r2
            float r3 = r3 - r12
            float r3 = r3 / r13
            int r2 = r1.getLeft()
            float r2 = (float) r2
            float r3 = r3 + r2
            int r1 = r1.getTop()
            float r1 = (float) r1
            r11.postTranslate(r3, r1)
            goto L_0x02ed
        L_0x02d3:
            r12 = r6
            double r1 = (double) r2
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r15 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x02f0
            r11.postScale(r12, r12)
            r9.getHeight()
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r12
            float r3 = r3 - r1
            float r3 = r3 / r13
            r11.postTranslate(r3, r14)
        L_0x02ed:
            r12 = r7
            goto L_0x0487
        L_0x02f0:
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.postScale(r1, r1)
            int r1 = r0.f348464d
            if (r8 != r1) goto L_0x030e
            int r1 = r9.getWidth()
            int r1 = r4 - r1
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            int r3 = r9.getHeight()
            int r3 = r5 - r3
            int r3 = r3 / r2
            float r3 = (float) r3
            r11.postTranslate(r1, r3)
            goto L_0x02ed
        L_0x030e:
            r2 = 2
            int r1 = r9.getWidth()
            int r1 = r4 - r1
            int r1 = r1 / r2
            float r1 = (float) r1
            r11.postTranslate(r1, r14)
            goto L_0x02ed
        L_0x031b:
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x03b2
            int r2 = r9.getWidth()
            r3 = 480(0x1e0, float:6.73E-43)
            if (r2 < r3) goto L_0x03b2
            int r2 = r9.getHeight()
            float r2 = (float) r2
            r3 = 1139802112(0x43f00000, float:480.0)
            float r2 = r2 / r3
            int r12 = r9.getHeight()
            float r12 = (float) r12
            float r3 = r3 / r12
            int r12 = r0.f348464d
            r6 = 1
            if (r6 != r12) goto L_0x0376
            float r2 = (float) r4
            int r3 = r9.getWidth()
            float r3 = (float) r3
            float r3 = r2 / r3
            float r12 = (float) r5
            int r14 = r9.getHeight()
            float r14 = (float) r14
            float r14 = r12 / r14
            int r15 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r15 <= 0) goto L_0x034f
            goto L_0x0350
        L_0x034f:
            r3 = r14
        L_0x0350:
            r11.postScale(r3, r3)
            int r14 = r9.getWidth()
            float r14 = (float) r14
            float r14 = r14 * r3
            float r2 = r2 - r14
            float r2 = r2 / r13
            int r14 = r1.getLeft()
            float r14 = (float) r14
            float r2 = r2 + r14
            int r14 = r9.getHeight()
            float r14 = (float) r14
            float r14 = r14 * r3
            float r12 = r12 - r14
            float r12 = r12 / r13
            int r1 = r1.getTop()
            float r1 = (float) r1
            float r12 = r12 + r1
            r11.postTranslate(r2, r12)
            goto L_0x02ed
        L_0x0376:
            r12 = r7
            double r6 = (double) r2
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x038b
            r11.postScale(r2, r3)
            int r1 = r5 + -480
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r11.postTranslate(r14, r1)
            goto L_0x0487
        L_0x038b:
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.postScale(r3, r3)
            int r1 = r9.getHeight()
            int r1 = r5 - r1
            int r1 = r1 / r2
            float r1 = (float) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " offsety "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            r11.postTranslate(r14, r1)
            goto L_0x0487
        L_0x03b2:
            r12 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r4
            int r6 = r9.getWidth()
            float r6 = (float) r6
            float r6 = r2 / r6
            float r7 = (float) r5
            int r14 = r9.getHeight()
            float r14 = (float) r14
            float r14 = r7 / r14
            int r15 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r15 >= 0) goto L_0x03cb
            r15 = r6
            goto L_0x03cc
        L_0x03cb:
            r15 = r14
        L_0x03cc:
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d1
            r14 = r6
        L_0x03d1:
            int r6 = r0.f348464d
            r3 = 1
            if (r3 != r6) goto L_0x03fc
            r11.postScale(r14, r14)
            int r3 = r9.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r14
            float r2 = r2 - r3
            float r2 = r2 / r13
            int r3 = r1.getLeft()
            float r3 = (float) r3
            float r2 = r2 + r3
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r14
            float r7 = r7 - r3
            float r7 = r7 / r13
            int r1 = r1.getTop()
            float r1 = (float) r1
            float r7 = r7 + r1
            r11.postTranslate(r2, r7)
            goto L_0x0487
        L_0x03fc:
            int r1 = r0.f348465e
            r3 = 1
            if (r1 != r3) goto L_0x0451
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            java.lang.String r3 = r0.f348472o
            r1.setGifPath(r3)
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            r1.getGifWidth()
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            r1.getGifHeight()
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            int r1 = r1.getGifWidth()
            float r1 = (float) r1
            float r1 = r1 / r2
            com.tencent.mm.ui.tools.CropImageView r3 = r0.f348468h
            int r3 = r3.getGifHeight()
            float r3 = (float) r3
            float r3 = r3 / r7
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x0427
            goto L_0x0428
        L_0x0427:
            r1 = r3
        L_0x0428:
            double r14 = (double) r1
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x0435
            r11.postScale(r1, r1)
            r16 = r1
            goto L_0x0437
        L_0x0435:
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0437:
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            int r1 = r1.getGifWidth()
            float r1 = (float) r1
            float r1 = r1 * r16
            float r2 = r2 - r1
            float r2 = r2 / r13
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            int r1 = r1.getGifHeight()
            float r1 = (float) r1
            float r1 = r1 * r16
            float r7 = r7 - r1
            float r7 = r7 / r13
            r11.postTranslate(r2, r7)
            goto L_0x0487
        L_0x0451:
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r2
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r7
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x0462
            goto L_0x0463
        L_0x0462:
            r1 = r3
        L_0x0463:
            r14 = r7
            double r6 = (double) r1
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x046f
            r11.postScale(r15, r15)
            goto L_0x0471
        L_0x046f:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0471:
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r15
            float r2 = r2 - r1
            float r2 = r2 / r13
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r15
            float r7 = r14 - r1
            float r7 = r7 / r13
            r11.postTranslate(r2, r7)
        L_0x0487:
            int r1 = r0.f348464d
            r2 = 1
            if (r2 != r1) goto L_0x0499
            com.tencent.mm.ui.tools.FilterImageView r1 = r0.f348466f
            if (r1 == 0) goto L_0x04a7
            r1.setMatrix(r11)
            com.tencent.mm.ui.tools.FilterImageView r1 = r0.f348466f
            r1.setImage(r9)
            goto L_0x04a7
        L_0x0499:
            int r1 = r0.f348465e
            if (r1 == r2) goto L_0x04a7
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            r1.setImageMatrix(r11)
            com.tencent.mm.ui.tools.CropImageView r1 = r0.f348468h
            r1.setImageBitmap(r9)
        L_0x04a7:
            int r1 = r0.f348464d
            if (r1 != r8) goto L_0x051e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((byte[]) r10)
            if (r1 == 0) goto L_0x0519
            r0.f348465e = r2
            qz1.c r1 = qz1.C101326c.m132949d()     // Catch:{ Exception -> 0x050f }
            java.lang.String r3 = r0.f348472o     // Catch:{ Exception -> 0x050f }
            qz1.b r1 = r1.mo140814b(r3, r3)     // Catch:{ Exception -> 0x050f }
            com.tencent.mm.ui.tools.CropImageView r3 = r0.f348468h     // Catch:{ Exception -> 0x050f }
            r3.setImageDrawable(r1)     // Catch:{ Exception -> 0x050f }
            r1.start()     // Catch:{ Exception -> 0x050f }
            r11.reset()     // Catch:{ Exception -> 0x050f }
            int r3 = r1.getIntrinsicWidth()     // Catch:{ Exception -> 0x050f }
            int r1 = r1.getIntrinsicHeight()     // Catch:{ Exception -> 0x050f }
            float r6 = (float) r4     // Catch:{ Exception -> 0x050f }
            float r7 = (float) r3     // Catch:{ Exception -> 0x050f }
            float r8 = r6 / r7
            float r9 = (float) r5     // Catch:{ Exception -> 0x050f }
            float r10 = (float) r1     // Catch:{ Exception -> 0x050f }
            float r14 = r9 / r10
            int r15 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r15 >= 0) goto L_0x04dd
            goto L_0x04de
        L_0x04dd:
            r8 = r14
        L_0x04de:
            float r14 = r7 / r6
            float r15 = r10 / r9
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x04e7
            goto L_0x04e8
        L_0x04e7:
            r14 = r15
        L_0x04e8:
            double r14 = (double) r14     // Catch:{ Exception -> 0x050f }
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x04fe
            r11.postScale(r8, r8)     // Catch:{ Exception -> 0x050f }
            float r7 = r7 * r8
            float r6 = r6 - r7
            float r6 = r6 / r13
            float r10 = r10 * r8
            float r9 = r9 - r10
            float r9 = r9 / r13
            r11.postTranslate(r6, r9)     // Catch:{ Exception -> 0x050f }
            goto L_0x0508
        L_0x04fe:
            int r4 = r4 - r3
            r3 = 2
            int r4 = r4 / r3
            float r4 = (float) r4     // Catch:{ Exception -> 0x050f }
            int r5 = r5 - r1
            int r5 = r5 / r3
            float r1 = (float) r5     // Catch:{ Exception -> 0x050f }
            r11.postTranslate(r4, r1)     // Catch:{ Exception -> 0x050f }
        L_0x0508:
            com.tencent.mm.ui.tools.CropImageView r0 = r0.f348468h     // Catch:{ Exception -> 0x050f }
            r0.setImageMatrix(r11)     // Catch:{ Exception -> 0x050f }
            goto L_0x05c5
        L_0x050f:
            r0 = move-exception
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x05c5
        L_0x0519:
            r1 = 0
            r0.f348465e = r1
            goto L_0x05c5
        L_0x051e:
            boolean r1 = r0.f348473p
            if (r1 != 0) goto L_0x0526
            boolean r1 = r0.f348474q
            if (r1 == 0) goto L_0x056f
        L_0x0526:
            r1 = 2131300611(0x7f091103, float:1.8219257E38)
            android.view.View r1 = r0.findViewById(r1)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r4)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/tools/CropImageNewUI"
            java.lang.String r6 = "initImageIV"
            java.lang.String r7 = "()Z"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r4 = r11.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            r1.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/ui/tools/CropImageNewUI"
            java.lang.String r5 = "initImageIV"
            java.lang.String r6 = "()Z"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x056f:
            android.content.Intent r1 = r26.getIntent()
            java.lang.String r3 = "CropImage_DirectlyIntoFilter"
            r4 = 0
            boolean r1 = r1.getBooleanExtra(r3, r4)
            if (r1 == 0) goto L_0x05c5
            r1 = 2131300603(0x7f0910fb, float:1.821924E38)
            android.view.View r0 = r0.findViewById(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r3)
            java.lang.Object[] r4 = r1.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/tools/CropImageNewUI"
            java.lang.String r6 = "initImageIV"
            java.lang.String r7 = "()Z"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/ui/tools/CropImageNewUI"
            java.lang.String r5 = "initImageIV"
            java.lang.String r6 = "()Z"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x05c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.CropImageNewUI.m163402H7(com.tencent.mm.ui.tools.CropImageNewUI):boolean");
    }

    /* renamed from: I7 */
    public static void m163403I7(CropImageNewUI cropImageNewUI, CropImageView cropImageView, View view) {
        Bitmap bitmap;
        int width;
        int height;
        CropImageNewUI cropImageNewUI2 = cropImageNewUI;
        CropImageView cropImageView2 = cropImageView;
        cropImageNewUI.getClass();
        Log.m105918d("MicroMsg.CropImageUI", "doCropImage" + cropImageNewUI2.f348475r);
        if (cropImageView2 != null && view != null) {
            if (cropImageNewUI2.f348475r) {
                Log.m105918d("MicroMsg.CropImageUI", "isCroping");
                return;
            }
            cropImageNewUI2.f348475r = true;
            Bitmap createBitmap = BitmapUtil.createBitmap(cropImageView.getBmp().getWidth(), cropImageView.getBmp().getHeight(), Bitmap.Config.RGB_565);
            if (createBitmap == null) {
                cropImageNewUI2.setResult(-1);
                cropImageNewUI.finish();
                return;
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) cropImageView.getScrollX(), (float) cropImageView.getScrollY());
            cropImageView2.draw(canvas);
            float[] fArr = new float[9];
            cropImageView.getImageMatrix().getValues(fArr);
            int left = view.getLeft();
            int top = view.getTop();
            int width2 = view.getWidth();
            int i = 0;
            float f = fArr[0];
            float f2 = 0.0f;
            if (f == 0.0f) {
                f = fArr[1];
            }
            Math.abs(f);
            Matrix imageMatrix = cropImageView.getImageMatrix();
            float[][] fArr2 = (float[][]) Array.newInstance(Float.TYPE, new int[]{3, 3});
            float[] fArr3 = new float[9];
            imageMatrix.getValues(fArr3);
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    fArr2[i2][i3] = fArr3[(i2 * 3) + i3];
                }
            }
            float[][] fArr4 = (float[][]) Array.newInstance(Float.TYPE, new int[]{3, 3});
            int i4 = 0;
            while (i4 < 3) {
                int i5 = 0;
                while (i5 < 3) {
                    fArr4[i4][i5] = i4 == i5 ? 1.0f : 0.0f;
                    i5++;
                }
                i4++;
            }
            int i6 = 0;
            while (i6 < 3) {
                float f3 = fArr2[i6][i6];
                if (f3 == f2) {
                    int i7 = i6 + 1;
                    while (true) {
                        if (i7 >= 3) {
                            break;
                        } else if (fArr2[i7][i6] == f2) {
                            i7++;
                        } else {
                            for (int i8 = 0; i8 < 3; i8++) {
                                float[] fArr5 = fArr2[i7];
                                float f4 = fArr5[i8];
                                float[] fArr6 = fArr2[i6];
                                fArr5[i8] = fArr6[i8];
                                fArr6[i8] = f4;
                                float[] fArr7 = fArr4[i7];
                                float f5 = fArr7[i8];
                                float[] fArr8 = fArr4[i6];
                                fArr7[i8] = fArr8[i8];
                                fArr8[i8] = f5;
                            }
                        }
                    }
                    f3 = fArr2[i6][i6];
                }
                for (int i9 = 0; i9 < 3; i9++) {
                    float[] fArr9 = fArr2[i6];
                    fArr9[i9] = fArr9[i9] / f3;
                    float[] fArr10 = fArr4[i6];
                    fArr10[i9] = fArr10[i9] / f3;
                }
                int i15 = 0;
                while (i15 < 3) {
                    if (i15 != i6) {
                        float f6 = fArr2[i15][i6];
                        while (i < 3) {
                            float[] fArr11 = fArr2[i15];
                            fArr11[i] = fArr11[i] - (fArr2[i6][i] * f6);
                            float[] fArr12 = fArr4[i15];
                            fArr12[i] = fArr12[i] - (fArr4[i6][i] * f6);
                            i++;
                        }
                    }
                    i15++;
                    i = 0;
                }
                i6++;
                i = 0;
                f2 = 0.0f;
            }
            try {
                if (cropImageNewUI2.f348476s == 1) {
                    int i16 = (int) (((double) width2) * 0.125d);
                    bitmap = m163405K7(fArr4, (float) left, (float) (top + i16), (float) (left + width2), (float) ((top + width2) - i16), cropImageView);
                } else {
                    bitmap = m163405K7(fArr4, (float) left, (float) top, (float) (left + width2), (float) (top + width2), cropImageView);
                }
            } catch (Throwable unused) {
                bitmap = null;
            }
            if (bitmap == null) {
                Log.m105920e("MicroMsg.CropImageUI", "doCropImage: error");
                cropImageNewUI2.setResult(-1);
                cropImageNewUI.finish();
                return;
            }
            Log.m105918d("MicroMsg.CropImageUI", "bm w: " + bitmap.getWidth() + " " + bitmap.getHeight());
            if (!(cropImageNewUI2.f348476s == 1 || (width = bitmap.getWidth()) == (height = bitmap.getHeight()))) {
                bitmap = width > height ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
            }
            String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C112760b.m154240l());
                sb.append(C90193h.m112878f((cropImageNewUI2.f348472o + System.currentTimeMillis()).getBytes()));
                sb.append("_crop.jpg");
                stringExtra = sb.toString();
            }
            if (cropImageNewUI2.mo177434M7(bitmap, stringExtra, true)) {
                Intent intent = new Intent();
                intent.putExtra("CropImage_OutputPath", stringExtra);
                FilterImageView filterImageView = cropImageNewUI2.f348466f;
                if (filterImageView != null) {
                    intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
                }
                cropImageNewUI2.setResult(-1, intent);
            } else {
                cropImageNewUI2.setResult(-1);
            }
            cropImageNewUI.finish();
        }
    }

    /* renamed from: J7 */
    public static void m163404J7(CropImageNewUI cropImageNewUI, boolean z) {
        String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_OutputPath");
        if (!C77702q0.m93719b(stringExtra)) {
            byte[] O = C86013q1.m106433O(cropImageNewUI.f348472o, 0, -1);
            C86013q1.m106438T(stringExtra, O, 0, O.length);
        } else {
            stringExtra = cropImageNewUI.f348472o;
        }
        Intent intent = new Intent();
        intent.putExtra("CropImage_Compress_Img", z);
        intent.putExtra("CropImage_OutputPath", stringExtra);
        intent.putExtra("CropImage_rotateCount", cropImageNewUI.f348468h.getRotateCount() % 4);
        FilterImageView filterImageView = cropImageNewUI.f348466f;
        if (filterImageView != null) {
            intent.putExtra("CropImage_filterId", filterImageView.getFilterId());
        }
        intent.putExtra("from_source", cropImageNewUI.getIntent().getIntExtra("from_source", 0));
        cropImageNewUI.setResult(-1, intent);
        cropImageNewUI.finish();
    }

    /* renamed from: K7 */
    public static Bitmap m163405K7(float[][] fArr, float f, float f2, float f3, float f4, CropImageView cropImageView) {
        if (cropImageView == null) {
            return null;
        }
        float[] fArr2 = {f3, f4, 1.0f};
        float[] a = C116163z0.m163435a(fArr, new float[]{f, f2, 1.0f});
        float[] a2 = C116163z0.m163435a(fArr, fArr2);
        int min = (int) Math.min(a[0], a2[0]);
        int min2 = (int) Math.min(a[1], a2[1]);
        int i = min < 0 ? 0 : min;
        int i2 = min2 < 0 ? 0 : min2;
        int abs = (int) Math.abs(a[0] - a2[0]);
        int abs2 = (int) Math.abs(a[1] - a2[1]);
        Matrix matrix = new Matrix();
        int rotateCount = cropImageView.getRotateCount() % 4;
        if (rotateCount == 0) {
            matrix.setRotate(0.0f, (float) (abs / 2), (float) (abs2 / 2));
        } else if (rotateCount == 1) {
            matrix.setRotate(90.0f, (float) (abs / 2), (float) (abs2 / 2));
        } else if (rotateCount == 2) {
            matrix.setRotate(180.0f, (float) (abs / 2), (float) (abs2 / 2));
        } else if (rotateCount == 3) {
            matrix.setRotate(270.0f, (float) (abs / 2), (float) (abs2 / 2));
        }
        Bitmap bmp = cropImageView.getBmp();
        int width = i + abs > bmp.getWidth() ? bmp.getWidth() - i : abs;
        if (i2 + abs2 > bmp.getHeight()) {
            abs2 = bmp.getHeight() - i2;
        }
        int i3 = abs2;
        Log.m105925i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", Integer.valueOf(bmp.getWidth()), Integer.valueOf(bmp.getHeight()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(i3));
        return Bitmap.createBitmap(bmp, i, i2, width, i3, matrix, true);
    }

    /* renamed from: L7 */
    public final Bitmap mo177433L7(int i, int i2) {
        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(this.f348472o, i2, i, true);
        if (this.f348471n != 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.setRotate((float) this.f348471n, (float) (extractThumbNail.getWidth() / 2), (float) (extractThumbNail.getHeight() / 2));
            Bitmap createBitmap = Bitmap.createBitmap(extractThumbNail, 0, 0, extractThumbNail.getWidth(), extractThumbNail.getHeight(), matrix, true);
            if (extractThumbNail != createBitmap) {
                Log.m105925i("MicroMsg.CropImageUI", "recycle bitmap:%s", extractThumbNail.toString());
                extractThumbNail.recycle();
            }
            extractThumbNail = createBitmap;
        }
        Log.m105918d("MicroMsg.CropImageUI", "getcrop degree:" + this.f348471n);
        return extractThumbNail;
    }

    /* renamed from: M7 */
    public final boolean mo177434M7(Bitmap bitmap, String str, boolean z) {
        if (str != null && !str.equals("")) {
            try {
                int i = this.f348476s;
                if (i == 1) {
                    BitmapUtil.saveBitmapToImage(bitmap, 30, Bitmap.CompressFormat.JPEG, str, z);
                } else if (i == 2) {
                    BitmapUtil.saveBitmapToImage(bitmap, 80, Bitmap.CompressFormat.JPEG, str, z);
                } else {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str, z);
                }
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CropImageUI", e, "", new Object[0]);
                Log.m105920e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + e.toString());
            }
        }
        return false;
    }

    public void activateBroadcast(boolean z) {
        if (z) {
            C34861g1.m40517a(z, new Intent().putExtra("classname", getClass().getName()).putExtra("main_process", false));
        } else {
            super.activateBroadcast(z);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7112yn;
    }

    public void initView() {
        MMActivityController.C73075r rVar = MMActivityController.C73075r.GREEN;
        setMMTitle("");
        this.f348467g = (LinearLayout) findViewById(C0966R.C0970id.bx_);
        this.f348469i = (ImageView) findViewById(C0966R.C0970id.bx8);
        this.f348470j = findViewById(C0966R.C0970id.f357816bx3);
        int intExtra = getIntent().getIntExtra("CropImageMode", 0);
        this.f348464d = intExtra;
        Assert.assertTrue("the image mode must be set", intExtra != 0);
        this.f348476s = getIntent().getIntExtra("CropImage_from_scene", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("CropImage_Filter", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
        if (booleanExtra) {
            C116153i0 i0Var = new C116153i0(this);
            C116154j0 j0Var = new C116154j0(this);
            FilterImageView filterImageView = (FilterImageView) findViewById(C0966R.C0970id.f357813bx0);
            this.f348466f = filterImageView;
            filterImageView.setOnConfirmImp(i0Var);
            this.f348466f.setOnExitImp(j0Var);
        }
        this.f348475r = false;
        CropImageView cropImageView = (CropImageView) findViewById(C0966R.C0970id.bxa);
        this.f348468h = cropImageView;
        cropImageView.post(new C116114a());
        this.f348468h.setOnShortClick(new C116115b());
        ((Button) findViewById(C0966R.C0970id.bxb)).setOnClickListener(new C116159w(this));
        Button button = (Button) findViewById(C0966R.C0970id.bxc);
        button.setOnClickListener(new C116160x(this));
        Button button2 = (Button) findViewById(C0966R.C0970id.bxd);
        button2.setOnClickListener(new C116161y(this));
        MTimerHandler mTimerHandler = new MTimerHandler(new C116162z(this), true);
        MTimerHandler mTimerHandler2 = new MTimerHandler(new C116147a0(this), true);
        button.setOnTouchListener(new C7004b0(this, mTimerHandler));
        button2.setOnTouchListener(new C7006c0(this, mTimerHandler2));
        int i = this.f348464d;
        if (i == 1) {
            C116156u uVar = new C116156u(this);
            C116157v vVar = new C116157v(this);
            FilterImageView filterImageView2 = (FilterImageView) findViewById(C0966R.C0970id.f357813bx0);
            this.f348466f = filterImageView2;
            filterImageView2.setOnConfirmImp(uVar);
            this.f348466f.setOnExitImp(vVar);
            this.f348466f.setLimitZoomIn(false);
            this.f348466f.mo177454b();
            this.f348466f.setCropMaskVisible(0);
            if (this.f348476s == 1) {
                this.f348466f.setCropMaskBackground(C0966R.C0969drawable.bin);
            }
        } else if (i == 2) {
            this.f348468h.setEnableOprate(false);
            View findViewById = findViewById(C0966R.C0970id.bwv);
            C9556a aVar = new C9556a();
            C60958c.m71442b(8, aVar);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.bx4);
            C9556a aVar2 = new C9556a();
            C60958c.m71442b(8, aVar2);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i == 3) {
            this.f348467g.setVisibility(8);
        } else if (i == 5) {
            int intExtra2 = getIntent().getIntExtra("CropImage_CompressType", 1);
            boolean booleanExtra3 = getIntent().getBooleanExtra("CropImage_BHasHD", false);
            if (intExtra2 == 1 || !booleanExtra3) {
                View findViewById3 = findViewById(C0966R.C0970id.bx4);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View findViewById4 = findViewById(C0966R.C0970id.bx4);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/tools/CropImageNewUI", "initFooterBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Button button3 = (Button) findViewById(C0966R.C0970id.bx5);
                button3.setBackgroundResource(C0966R.C0969drawable.f4669jj);
                button3.setPadding(25, 8, 25, 8);
                button3.setOnClickListener(new C7009d0(this));
            }
        }
        Log.m105918d("MicroMsg.CropImageUI", "mode is  " + this.f348464d);
        C116116c cVar = new C116116c(booleanExtra, booleanExtra2);
        int i2 = this.f348464d;
        if (i2 == 5) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, cVar);
        } else if (i2 == 4) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, cVar);
            View findViewById5 = findViewById(C0966R.C0970id.bx4);
            C9556a aVar5 = new C9556a();
            C60958c.m71442b(0, aVar5);
            View view5 = findViewById5;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Button button4 = (Button) findViewById(C0966R.C0970id.bx5);
            button4.setText(C0966R.string.bwa);
            button4.setOnClickListener(new C116117d());
        } else {
            addTextOptionMenu(0, getString(C0966R.string.bwe), cVar, (View.OnLongClickListener) null, rVar);
        }
        if (booleanExtra && booleanExtra2) {
            addTextOptionMenu(0, getString(C0966R.string.bwa), cVar, (View.OnLongClickListener) null, rVar);
        }
        setBackBtn(new C116118e());
        if (this.f348464d == 6) {
            View findViewById6 = findViewById(C0966R.C0970id.bx4);
            C9556a aVar6 = new C9556a();
            C60958c.m71442b(8, aVar6);
            View view6 = findViewById6;
            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/tools/CropImageNewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            addTextOptionMenu(0, getString(C0966R.string.bwe), new C116119f(), (View.OnLongClickListener) null, rVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105918d("MicroMsg.CropImageUI", "onConfigurationChanged, config.orientation = " + configuration.orientation);
        int i = configuration.orientation;
        if (i == 1 || i == 2) {
            Log.m105926v("MicroMsg.CropImageUI", "onConfigurationChanged");
            this.f348468h.post(new C116122g());
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        CropImageView cropImageView = this.f348468h;
        if (cropImageView != null) {
            Bitmap bitmap = cropImageView.f348494e;
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.CropImageView", "recycle bitmap:%s", cropImageView.f348494e.toString());
                cropImageView.f348494e.recycle();
            }
            C34379c<?> cVar = cropImageView.f348508v;
            if (cVar != null) {
                cVar.cancel(false);
                cropImageView.f348508v = null;
            }
            cropImageView.f348509w.removeCallbacksAndMessages((Object) null);
            cropImageView.f348510x.removeCallbacksAndMessages((Object) null);
        }
        FilterImageView filterImageView = this.f348466f;
        if (filterImageView != null) {
            filterImageView.f348520e = null;
            Bitmap bitmap2 = filterImageView.f348524i;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                Log.m105925i("MicroMsg.FilterView", "recycle bitmap:%s", filterImageView.f348524i.toString());
                filterImageView.f348524i.recycle();
            }
            filterImageView.f348524i = null;
        }
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        initView();
    }

    public void onResume() {
        super.onResume();
        setRequestedOrientation(1);
    }
}
