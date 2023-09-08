package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import eb0.C75592q0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p159gw.C98250h;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg */
public class PreviewLastHdHeadImg extends MMActivity implements View.OnClickListener {

    /* renamed from: i */
    public static final /* synthetic */ int f20735i = 0;

    /* renamed from: d */
    public ImageView f20736d;

    /* renamed from: e */
    public Bitmap f20737e;

    /* renamed from: f */
    public TextView f20738f;

    /* renamed from: g */
    public String f20739g;

    /* renamed from: h */
    public String f20740h;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg$a */
    public class C5239a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg$a$a */
        public class C5240a implements C11182m0 {
            public C5240a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                if (PreviewLastHdHeadImg.this.f20737e != null) {
                    e0Var.mo107125a(0, C0966R.string.fem);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg$a$b */
        public class C5241b implements C11184p0 {
            public C5241b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                PreviewLastHdHeadImg previewLastHdHeadImg = PreviewLastHdHeadImg.this;
                int i2 = PreviewLastHdHeadImg.f20735i;
                previewLastHdHeadImg.getClass();
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(previewLastHdHeadImg.getContext(), new C5406w(previewLastHdHeadImg), new C5408x(previewLastHdHeadImg));
            }
        }

        public C5239a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) PreviewLastHdHeadImg.this, 1, false);
            nVar.f225771i = new C5240a();
            nVar.f225782p = new C5241b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg$b */
    public class C5242b implements MenuItem.OnMenuItemClickListener {
        public C5242b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PreviewLastHdHeadImg.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ayd;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.it4);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        setNavigationbarColor(getResources().getColor(C0966R.color.BW_0));
        this.f20739g = C75592q0.m90789s();
        this.f20740h = getIntent().getStringExtra("last_avatar_path");
        this.f20736d = (ImageView) findViewById(C0966R.C0970id.eu5);
        this.f20737e = BitmapUtil.getBitmapNative(this.f20740h);
        this.f20738f = (TextView) findViewById(C0966R.C0970id.l1l);
        this.f20736d.setImageBitmap(this.f20737e);
        this.f20738f.setOnClickListener(this);
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5239a());
        setBackBtn(new C5242b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "CropImage_OutputPath"
            java.lang.String r12 = r12.getStringExtra(r0)
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/setting/ui/setting/PreviewLastHdHeadImg"
            r5 = 0
            if (r12 == 0) goto L_0x0081
            android.graphics.Bitmap r6 = r11.f20737e
            java.lang.String r7 = ""
            boolean r8 = r12.equals(r7)
            if (r8 != 0) goto L_0x0066
            r8 = 100
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0045 }
            r10 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r6, r8, r9, r12, r10)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0067
        L_0x0045:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = "MicroMsg.PreviewLastHdHeadImg"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "saveBitmapToImage failed:"
            r7.append(r8)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r6)
        L_0x0066:
            r10 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0081
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.putExtra(r0, r12)
            java.lang.String r12 = "CropImage_NeedCompress"
            r6.putExtra(r12, r5)
            r12 = -1
            r11.setResult(r12, r6)
            r11.finish()
            j20.C117292a.m165361g(r11, r4, r3, r2, r1)
            return
        L_0x0081:
            r11.setResult(r5)
            r11.finish()
            j20.C117292a.m165361g(r11, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.PreviewLastHdHeadImg.onClick(android.view.View):void");
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
    }
}
