package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.model.C6057s;
import com.tencent.p014mm.plugin.webview.model.C6061v;
import com.tencent.p014mm.plugin.webview.model.C6070z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import di3.C86312j;
import ea3.C7608b;
import ea3.C7610g;
import eb0.C75592q0;
import f12.C7970a;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p140cw.C7138g;
import p196ln.C10579k;
import p196ln.C76706g;
import p645pj.C77092c;
import qn3.C77382c;
import qo3.C89779i0;
import te3.C48675a72;
import te3.C51331t2;
import te3.C51631v2;
import te3.C90438s43;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI */
public class CreateAvatarUI extends MMActivity implements C11385n, C77382c.C77383a {

    /* renamed from: d */
    public InputMethodManager f22479d;

    /* renamed from: e */
    public EditText f22480e;

    /* renamed from: f */
    public String f22481f;

    /* renamed from: g */
    public String f22482g;

    /* renamed from: h */
    public String f22483h;

    /* renamed from: i */
    public boolean f22484i = true;

    /* renamed from: j */
    public boolean f22485j = false;

    /* renamed from: n */
    public C89779i0 f22486n;

    /* renamed from: o */
    public volatile C7610g f22487o;

    /* renamed from: p */
    public String f22488p;

    /* renamed from: q */
    public boolean f22489q = false;

    /* renamed from: r */
    public long f22490r = 0;

    /* renamed from: s */
    public long f22491s = 0;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$a */
    public class C6110a implements DialogInterface.OnCancelListener {
        public C6110a(CreateAvatarUI createAvatarUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            try {
                dialogInterface.dismiss();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CreateAvatarUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$b */
    public class C6111b implements MenuItem.OnMenuItemClickListener {
        public C6111b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CreateAvatarUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$c */
    public class C6112c implements TextView.OnEditorActionListener {
        public C6112c() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                CreateAvatarUI createAvatarUI = CreateAvatarUI.this;
                createAvatarUI.f22479d = (InputMethodManager) createAvatarUI.getSystemService("input_method");
                InputMethodManager inputMethodManager = CreateAvatarUI.this.f22479d;
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    CreateAvatarUI createAvatarUI2 = CreateAvatarUI.this;
                    createAvatarUI2.f22479d.hideSoftInputFromWindow(createAvatarUI2.getCurrentFocus().getWindowToken(), 0);
                    CreateAvatarUI.this.f22480e.setCursorVisible(false);
                    CreateAvatarUI.this.getWindow().getDecorView().requestFocus();
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$d */
    public class C6113d implements View.OnKeyListener {
        public C6113d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (i == 4) {
                CreateAvatarUI createAvatarUI = CreateAvatarUI.this;
                createAvatarUI.f22479d = (InputMethodManager) createAvatarUI.getSystemService("input_method");
                InputMethodManager inputMethodManager = CreateAvatarUI.this.f22479d;
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    CreateAvatarUI createAvatarUI2 = CreateAvatarUI.this;
                    createAvatarUI2.f22479d.hideSoftInputFromWindow(createAvatarUI2.getCurrentFocus().getWindowToken(), 0);
                    CreateAvatarUI.this.f22480e.setCursorVisible(false);
                    CreateAvatarUI.this.getWindow().getDecorView().requestFocus();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$e */
    public class C6114e implements TextWatcher {
        public C6114e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!CreateAvatarUI.this.f22480e.getText().toString().equals("")) {
                CreateAvatarUI.this.findViewById(C0966R.C0970id.f357810bw1).setEnabled(true);
            } else {
                CreateAvatarUI.this.findViewById(C0966R.C0970id.f357810bw1).setEnabled(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$f */
    public class C6115f implements View.OnTouchListener {
        public C6115f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                CreateAvatarUI.this.f22480e.setCursorVisible(true);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$g */
    public class C6116g implements View.OnClickListener {
        public C6116g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8316Ya(CreateAvatarUI.this, 4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$h */
    public class C6117h implements View.OnClickListener {
        public C6117h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CreateAvatarUI createAvatarUI = CreateAvatarUI.this;
            String str = createAvatarUI.f22482g;
            createAvatarUI.getClass();
            Log.m105925i("MicroMsg.CreateAvatarUI", "doGetRandomAvatar appid: %s", str);
            C86709a0.m107524d().mo123460f(new C6070z(str));
            createAvatarUI.f22491s = System.currentTimeMillis();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$i */
    public class C6118i implements View.OnClickListener {
        public C6118i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = CreateAvatarUI.this.f22480e.getText().toString();
            String e = C77092c.m93043e();
            if (!Util.isNullOrNil(e)) {
                if (obj.matches(".*[" + e + "].*")) {
                    C76879j.m92748s(CreateAvatarUI.this.getContext(), CreateAvatarUI.this.getString(C0966R.string.frk, new Object[]{e}), CreateAvatarUI.this.getString(C0966R.string.a3h));
                    C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C77382c b = C77382c.m93286b(CreateAvatarUI.this.f22480e);
            b.f225611e = 1;
            b.f225610d = 32;
            b.mo107499d(CreateAvatarUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo7066H7(String str, String str2, String str3, int i) {
        Log.m105925i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str);
        mo7068J7();
        C86709a0.m107524d().mo123460f(new C6057s(str, str2, str3, i));
        this.f22490r = System.currentTimeMillis();
    }

    /* renamed from: I7 */
    public final boolean mo7067I7(int i) {
        if (i == 1 || i == 2 || i == 7 || i == 8) {
            Log.m105920e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, errType = " + i);
            return false;
        } else if (NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            return true;
        } else {
            Log.m105920e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, not connected");
            return false;
        }
    }

    /* renamed from: J7 */
    public final void mo7068J7() {
        C89779i0 i0Var = this.f22486n;
        if (i0Var == null || i0Var.isShowing()) {
            this.f22486n = C76879j.m92723Q(this, (String) null, getString(C0966R.string.bw6), true, true, new C6110a(this));
            return;
        }
        this.f22486n.show();
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        C76879j.m92738i(this, C0966R.string.iug, C0966R.string.iui);
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        C76879j.m92738i(this, C0966R.string.iuf, C0966R.string.iui);
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        this.f22489q = true;
        if (this.f22485j || this.f22487o == null || this.f22484i) {
            String str2 = this.f22483h;
            if (str2 == null || str2.isEmpty()) {
                Bitmap centerCropBitmap = BitmapUtil.getCenterCropBitmap(BitmapUtil.getBitmapNative((int) C0966R.raw.default_avatar), 500, 500, false);
                String str3 = this.f22482g;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BitmapUtil.compress(centerCropBitmap, Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.CreateAvatarUI", e, "", new Object[0]);
                }
                Log.m105925i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str3);
                mo7068J7();
                C86709a0.m107524d().mo123460f(new C6057s(str3, str, byteArray, 0));
                this.f22490r = System.currentTimeMillis();
                return;
            }
            mo7066H7(this.f22482g, str, this.f22483h, 1);
        } else if (this.f22487o.f25888f == C7610g.C7613c.SUCCESS) {
            mo7066H7(this.f22482g, str, this.f22488p, 1);
        } else if (this.f22487o.f25888f == C7610g.C7613c.FAIL) {
            mo7068J7();
            this.f22487o.mo8747a(this.f22481f, this.f22482g);
        } else {
            mo7068J7();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x007d
            android.view.View r0 = r8.getCurrentFocus()
            if (r0 == 0) goto L_0x0052
            boolean r3 = r0 instanceof android.widget.EditText
            if (r3 == 0) goto L_0x0052
            r3 = 2
            int[] r3 = new int[r3]
            r3 = {0, 0} // fill-array
            r0.getLocationInWindow(r3)
            r4 = r3[r2]
            r3 = r3[r1]
            int r5 = r0.getHeight()
            int r5 = r5 + r3
            int r6 = r0.getWidth()
            int r6 = r6 + r4
            float r7 = r9.getX()
            float r4 = (float) r4
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0053
            float r4 = r9.getX()
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0053
            float r4 = r9.getY()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0053
            float r3 = r9.getY()
            float r4 = (float) r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            android.widget.EditText r3 = r8.f22480e
            r3.setCursorVisible(r1)
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r8.f22479d = r1
            if (r1 == 0) goto L_0x0078
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
            android.widget.EditText r0 = r8.f22480e
            r0.setCursorVisible(r2)
            android.view.Window r0 = r8.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.requestFocus()
        L_0x0078:
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x007d:
            android.view.Window r0 = r8.getWindow()
            boolean r0 = r0.superDispatchTouchEvent(r9)
            if (r0 != 0) goto L_0x008f
            boolean r9 = r8.onTouchEvent(r9)
            if (r9 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.CreateAvatarUI.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7108yj;
    }

    public final void init() {
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!Util.isNullOrNil(stringExtra)) {
            setMMTitle(stringExtra);
        } else {
            setMMTitle(getString(C0966R.string.h7v));
        }
        setBackBtn(new C6111b());
        this.f22482g = getIntent().getStringExtra("0");
        this.f22483h = getIntent().getStringExtra("default_fileid");
        EditText editText = (EditText) findViewById(C0966R.C0970id.hfy);
        this.f22480e = editText;
        editText.setOnEditorActionListener(new C6112c());
        this.f22480e.setOnKeyListener(new C6113d());
        this.f22480e.setHintTextColor(getResources().getColor(C0966R.color.f3563xt));
        this.f22480e.addTextChangedListener(new C6114e());
        this.f22480e.setOnTouchListener(new C6115f());
        findViewById(C0966R.C0970id.bas).setOnClickListener(new C6116g());
        findViewById(C0966R.C0970id.ic7).setOnClickListener(new C6117h());
        findViewById(C0966R.C0970id.f357810bw1).setOnClickListener(new C6118i());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C86001b0 q;
        Log.m105925i("MicroMsg.CreateAvatarUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            Log.m105920e("MicroMsg.CreateAvatarUI", "Get image from album failed");
        } else if (i != 4) {
            if (i == 5 && intent != null) {
                String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                if (stringExtra == null) {
                    Log.m105920e("MicroMsg.CreateAvatarUI", "crop picture failed");
                    return;
                }
                Object[] objArr = new Object[2];
                objArr[0] = stringExtra;
                Uri n = C116299g2.m163858n(stringExtra);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                long j = 0;
                if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                    j = q.f250473c;
                }
                objArr[1] = Long.valueOf(j);
                Log.m105925i("MicroMsg.CreateAvatarUI", "onActivityResult(CROP_PICTURE_FOR_AVATAR)  file:%s, size:%d", objArr);
                this.f22481f = stringExtra;
                this.f22489q = false;
                this.f22484i = false;
                this.f22485j = false;
                ((ImageView) findViewById(C0966R.C0970id.a2e)).setImageBitmap(MMBitmapFactory.m98734c(stringExtra));
                if (this.f22487o == null) {
                    this.f22487o = new C7610g();
                    this.f22487o.f25885c.observe(this, new C6154d(this));
                }
                this.f22488p = null;
                this.f22487o.mo8747a(this.f22481f, this.f22482g);
            }
        } else if (intent != null) {
            Intent intent2 = new Intent();
            intent2.setClassName(this, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
            intent2.putExtra("CropImage_OutputPath", ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            C7013o.m7259a(this, intent, intent2, C7970a.m8127a(), 5, (C7013o.C7017c) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("extra_call_by_appbrand", false)) {
            C7608b.INSTANCE.mo8746c(4, "");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f22486n;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(2500, this);
        C86709a0.m107524d().mo123470p(2785, this);
        C86709a0.m107524d().mo123470p(2667, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(2500, this);
        C86709a0.m107524d().mo123455a(2785, this);
        C86709a0.m107524d().mo123455a(2667, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7608b bVar = C7608b.INSTANCE;
        if (yVar instanceof C6057s) {
            Log.m105925i("MicroMsg.CreateAvatarUI", "onAddAvatarEnd errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            C89779i0 i0Var = this.f22486n;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (i == 0 && i2 == 0) {
                C90438s43 s432 = ((C51631v2) ((C6057s) yVar).f22353d.f127056b.f127083a).f143254d;
                Intent intent = new Intent();
                intent.putExtra("id", s432.f259829d);
                intent.putExtra("nickname", s432.f259830e);
                intent.putExtra("avatarurl", s432.f259831f);
                setResult(-1, intent);
                finish();
            } else if (!mo7067I7(i)) {
                C76879j.m92748s(this, getString(C0966R.string.lif), getString(C0966R.string.bvz));
            } else {
                C76879j.m92748s(this, str, getString(C0966R.string.bvz));
            }
            bVar.mo8745b(6, (int) (System.currentTimeMillis() - this.f22490r), i2);
        } else if (yVar instanceof C6070z) {
            Log.m105925i("MicroMsg.CreateAvatarUI", "onGetRandomAvatarEnd errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                C48675a72 a722 = (C48675a72) ((C6070z) yVar).f22373d.f127056b.f127083a;
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59359o = C0966R.raw.default_avatar;
                bVar2.f59365u = getResources().getDimension(C0966R.dimen.f357058am1);
                bVar2.f59364t = true;
                C20828a.m22825b().mo32519h(a722.f130341e, (ImageView) findViewById(C0966R.C0970id.a2e), bVar2.mo32666a());
                this.f22480e.setText(a722.f130340d);
                this.f22485j = true;
                this.f22484i = false;
                this.f22483h = a722.f130342f;
                if (!this.f22480e.getText().toString().equals("")) {
                    findViewById(C0966R.C0970id.f357810bw1).setEnabled(true);
                } else {
                    findViewById(C0966R.C0970id.f357810bw1).setEnabled(false);
                }
            } else if (!mo7067I7(i)) {
                C76879j.m92748s(this, getString(C0966R.string.lif), getString(C0966R.string.f360325bw1));
            } else {
                C76879j.m92748s(this, str, getString(C0966R.string.f360325bw1));
            }
            bVar.mo8745b(5, (int) (System.currentTimeMillis() - this.f22491s), i2);
        } else if (yVar instanceof C6061v) {
            C7610g.C7613c cVar = C7610g.C7613c.SUCCESS;
            Log.m105925i("MicroMsg.CreateAvatarUI", "onGetCreateAvatarEnd errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (this.f22487o == null) {
                Log.m105920e("MicroMsg.CreateAvatarUI", "uploadEngine == null, multi-Thread Error, thread name = " + Thread.currentThread().getName());
                return;
            }
            C7610g gVar = this.f22487o;
            gVar.getClass();
            C6061v vVar = (C6061v) yVar;
            String str2 = vVar.f22361f;
            if (!str2.equals(gVar.f25887e)) {
                Log.m105925i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after onSceneEnd", gVar.f25887e, str2);
            } else if (i == 0 && i2 == 0) {
                gVar.f25888f = cVar;
                C51331t2 t2Var = (C51331t2) vVar.f22359d.f127056b.f127083a;
                gVar.f25885c.postValue(t2Var.f141906d);
                Log.m105925i("MicroMsg.VestImgUploadEngine", "file id create success: %s", t2Var.f141906d);
            } else {
                gVar.f25888f = C7610g.C7613c.FAIL;
                Log.m105925i("MicroMsg.VestImgUploadEngine", "file id create failed: errType = %s, errCode = %s, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            }
            if (this.f22489q) {
                C89779i0 i0Var2 = this.f22486n;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                if (this.f22487o.f25888f != cVar) {
                    C89779i0 i0Var3 = this.f22486n;
                    if (i0Var3 != null) {
                        i0Var3.dismiss();
                    }
                    if (!mo7067I7(i)) {
                        C89779i0 i0Var4 = this.f22486n;
                        if (i0Var4 != null) {
                            i0Var4.dismiss();
                        }
                        C76879j.m92748s(this, getString(C0966R.string.lif), getString(C0966R.string.bvz));
                        return;
                    }
                    C76879j.m92748s(this, str, getString(C0966R.string.bvz));
                }
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C6153c.class);
    }
}
