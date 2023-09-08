package com.tencent.p014mm.xwebutil;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.C103568x;
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderX5;
import com.tencent.xweb.XFileSdk;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import go3.C76004e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import s00.C110692d;

/* renamed from: com.tencent.mm.xwebutil.d */
public class C19894d extends C19900e {

    /* renamed from: a */
    public static boolean f56719a;

    /* renamed from: b */
    public static C110692d.C22288a f56720b;

    /* renamed from: com.tencent.mm.xwebutil.d$d */
    public static /* synthetic */ class C19895d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56721a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.xweb.FileReaderHelper$ReaderType[] r0 = com.tencent.xweb.FileReaderHelper.ReaderType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56721a = r0
                com.tencent.xweb.FileReaderHelper$ReaderType r1 = com.tencent.xweb.FileReaderHelper.ReaderType.XWEB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56721a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.xweb.FileReaderHelper$ReaderType r1 = com.tencent.xweb.FileReaderHelper.ReaderType.X5     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.xwebutil.C19894d.C19895d.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.d$a */
    public class C19896a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ValueCallback f56722d;

        public C19896a(ValueCallback valueCallback) {
            this.f56722d = valueCallback;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/xwebutil/FileReaderLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f56722d.onReceiveValue("fileReaderClosed");
            C117292a.m165361g(this, "com/tencent/mm/xwebutil/FileReaderLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.d$b */
    public class C19897b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ValueCallback f56723d;

        public C19897b(ValueCallback valueCallback) {
            this.f56723d = valueCallback;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/xwebutil/FileReaderLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f56723d.onReceiveValue("fileReaderMenuClicked");
            C117292a.m165361g(this, "com/tencent/mm/xwebutil/FileReaderLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.d$c */
    public class C19898c implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ String f56724d;

        /* renamed from: e */
        public final /* synthetic */ String f56725e;

        /* renamed from: f */
        public final /* synthetic */ String f56726f;

        /* renamed from: g */
        public final /* synthetic */ long f56727g;

        /* renamed from: h */
        public final /* synthetic */ MMActivity f56728h;

        /* renamed from: com.tencent.mm.xwebutil.d$c$a */
        public class C19899a implements Runnable {
            public C19899a() {
            }

            public void run() {
                MMActivity mMActivity = C19898c.this.f56728h;
                C75026b.m89951a(mMActivity, mMActivity.getString(C0966R.string.lpo));
            }
        }

        public C19898c(String str, String str2, String str3, long j, MMActivity mMActivity) {
            this.f56724d = str;
            this.f56725e = str2;
            this.f56726f = str3;
            this.f56727g = j;
            this.f56728h = mMActivity;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i != 1 || i2 != -1) {
                Log.m105920e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, resultCode not ok");
            } else if (intent == null) {
                Log.m105920e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, retData is null");
            } else {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("XFilesReaderLogic", "sendFileToFriend, mmOnActivityResult fail, toUser is null");
                    return;
                }
                Log.m105924i("XFilesReaderLogic", "sendFileToFriend, send broadcast, filePath: " + this.f56724d);
                Intent intent2 = new Intent();
                intent2.setAction("MINIQB_OPEN_RET");
                intent2.putExtra("op_type", "SEND_TO_FRIENDS");
                intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, this.f56724d);
                intent2.putExtra("file_name", this.f56725e);
                intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, this.f56726f);
                intent2.putExtra("forward_msgid", this.f56727g);
                intent2.putExtra("to_user", stringExtra);
                intent2.putExtra("send_text", stringExtra2);
                this.f56728h.sendBroadcast(intent2, WeChatPermissions.PERMISSION_MM_MESSAGE());
                MMHandlerThread.postToMainThread(new C19899a());
            }
        }
    }

    /* renamed from: a */
    public static void m21642a(Context context, String str, String str2) {
        String b = m21643b(str2);
        C19905j.m21649a(str, b);
        XFileSdk.finishReadFile(str, b);
        FileReaderX5.finishReadFile(context, str, b);
    }

    /* renamed from: b */
    public static String m21643b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("XFilesReaderLogic", "getSafeRealPath filePath is empty");
            return str;
        }
        try {
            String i = C86013q1.m106448i(str, false);
            if (Util.isNullOrNil(i)) {
                Log.m105921e("XFilesReaderLogic", "getSafeRealPath real path is empty, use old path %s", str);
                return str;
            } else if (i.equals(str)) {
                Log.m105925i("XFilesReaderLogic", "getSafeRealPath real path is the same %s", i);
                return i;
            } else {
                Log.m105925i("XFilesReaderLogic", "getSafeRealPath from %s to %s", str, i);
                return i;
            }
        } catch (Exception e) {
            Log.m105921e("XFilesReaderLogic", "getSafeRealPath error: %s", e.getMessage());
            return str;
        }
    }

    /* renamed from: c */
    public static ViewGroup m21644c(MMActivity mMActivity, String str, ValueCallback<String> valueCallback, boolean z, boolean z2) {
        C110692d.C22288a aVar;
        WeakReference<View> weakReference;
        View view;
        MMActivity mMActivity2 = mMActivity;
        ValueCallback<String> valueCallback2 = valueCallback;
        View inflate = C85868k2.m106137b(mMActivity.getContext()).inflate(C0966R.C0971layout.cjh, new LinearLayout(mMActivity.getContext()), false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.lvb);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.lvc);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.lvd);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0966R.C0970id.lve);
        ImageButton imageButton = (ImageButton) inflate.findViewById(C0966R.C0970id.lvf);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0966R.C0970id.lv_);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(C0966R.C0970id.lv9);
        if (textView == null || textView2 == null || linearLayout == null || linearLayout2 == null || imageButton == null || linearLayout3 == null || imageButton2 == null) {
            Log.m105920e("XFilesReaderLogic", "initView can not find view");
            return null;
        }
        linearLayout2.setVisibility(0);
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new C19896a(valueCallback2));
        linearLayout3.setVisibility(0);
        if (z) {
            imageButton2.setVisibility(0);
            imageButton2.setOnClickListener(new C19897b(valueCallback2));
        } else {
            imageButton2.setVisibility(8);
        }
        linearLayout.setVisibility(0);
        textView2.setVisibility(0);
        textView2.setText(C0966R.string.lpp);
        textView.setVisibility(0);
        textView.setText(str);
        FrameLayout frameLayout = new FrameLayout(mMActivity2);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(mMActivity2);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setTag(XFileSdk.VIEW_TAG_RELATIVE_LAYOUT);
        frameLayout.addView(relativeLayout);
        Toolbar toolbar = new Toolbar(mMActivity2, (AttributeSet) null);
        toolbar.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        if (toolbar.f305675z == null) {
            toolbar.f305675z = new C103568x();
        }
        C103568x xVar = toolbar.f305675z;
        xVar.f305863h = false;
        xVar.f305860e = 0;
        xVar.f305856a = 0;
        xVar.f305861f = 0;
        xVar.f305857b = 0;
        toolbar.setTag(XFileSdk.VIEW_TAG_TOOLBAR);
        frameLayout.addView(toolbar);
        int color = mMActivity.getResources().getColor(C0966R.color.a7_);
        if (z2) {
            linearLayout.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            frameLayout.setBackgroundColor(-13421773);
            toolbar.setBackgroundColor(3355443);
            m21648g(mMActivity2, -13421773);
            imageButton.setImageResource(C0966R.C0969drawable.f357089bt1);
            imageButton2.setImageResource(C0966R.C0969drawable.f357091bt3);
        } else if (C85875k4.m106211z()) {
            frameLayout.setBackgroundColor(-15132391);
            toolbar.setBackgroundColor(color);
            m21648g(mMActivity2, color);
            imageButton.setImageResource(C0966R.C0969drawable.f357089bt1);
            imageButton2.setImageResource(C0966R.C0969drawable.f357091bt3);
        } else {
            frameLayout.setBackgroundColor(-3355444);
            toolbar.setBackgroundColor(color);
            imageButton.setImageResource(C0966R.C0969drawable.bsw);
            imageButton2.setImageResource(C0966R.C0969drawable.bsz);
        }
        if (!(z2 || (aVar = f56720b) == null || (weakReference = aVar.f63184a) == null || (view = weakReference.get()) == null)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 81;
            view.setLayoutParams(layoutParams);
            view.setTag(XFileSdk.VIEW_TAG_BOTTOM_BAR);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/xwebutil/FileReaderLogic", "initView", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Landroid/webkit/ValueCallback;ZZ)Landroid/view/ViewGroup;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.addView(view);
        }
        mMActivity2.setContentView((View) frameLayout);
        mMActivity2.setSupportActionBar(toolbar);
        ActionBar N = C76004e.m91288N(mMActivity.getSupportActionBar());
        if (N == null) {
            return null;
        }
        N.mo91088F(false);
        N.mo91084B(false);
        N.mo91087E(false);
        N.mo91086D(true);
        N.mo91114y(inflate);
        return frameLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x044f A[Catch:{ all -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0450 A[Catch:{ all -> 0x049c }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21645d(android.content.Context r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, java.util.HashMap<java.lang.String, java.lang.String> r39, android.webkit.ValueCallback<java.lang.String> r40, android.webkit.ValueCallback<java.lang.Integer> r41, boolean r42) {
        /*
            r0 = r33
            r8 = r35
            r10 = r37
            r7 = r39
            r9 = r40
            r15 = r41
            r1 = r42
            if (r7 == 0) goto L_0x001b
            r2 = r1 ^ 1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "hide_title_bar_right_button"
            r7.put(r3, r2)
        L_0x001b:
            java.lang.String r13 = m21643b(r34)
            if (r36 == 0) goto L_0x0027
            java.lang.String r2 = r36.toLowerCase()
            r14 = r2
            goto L_0x0029
        L_0x0027:
            r14 = r36
        L_0x0029:
            com.tencent.p014mm.xwebutil.C19911o.m21657b()
            if (r38 == 0) goto L_0x0045
            r1 = 40
            r6 = 1
            com.tencent.mm.xwebutil.a r11 = new com.tencent.mm.xwebutil.a
            r11.<init>(r15)
            r2 = r33
            r3 = r13
            r4 = r14
            r5 = r37
            r7 = r39
            r8 = r40
            r9 = r11
            com.tencent.xweb.FileReaderX5.readFile(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0045:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r3 = 1
            com.tencent.xweb.FileReaderHelper$ReaderType r4 = com.tencent.xweb.FileReaderHelper.getReaderType(r14, r3, r2)
            java.lang.String r5 = com.tencent.xweb.FileReaderHelper.OPEN_X5_SCENE_STR
            r6 = 40
            int r2 = r2.getIntExtra(r5, r6)
            int[] r5 = com.tencent.p014mm.xwebutil.C19894d.C19895d.f56721a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r3) goto L_0x0078
            r6 = 0
            com.tencent.mm.xwebutil.a r11 = new com.tencent.mm.xwebutil.a
            r11.<init>(r15)
            r1 = r2
            r2 = r33
            r3 = r13
            r4 = r14
            r5 = r37
            r7 = r39
            r8 = r40
            r9 = r11
            com.tencent.xweb.FileReaderX5.readFile(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x04ce
        L_0x0078:
            boolean r4 = com.tencent.xweb.FileReaderHelper.isAudioFormat(r14)
            java.lang.String r5 = "extra_param_open_file_scene"
            java.lang.String r6 = "extra_param_is_qb_installed"
            java.lang.String r11 = "extra_param_open_file_from"
            java.lang.String r12 = "XFilesReaderLogic"
            if (r4 == 0) goto L_0x036d
            boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            r3 = 0
            if (r4 != 0) goto L_0x0096
            java.lang.String r1 = "playAudioFileByXWeb not mmactivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            r4 = -4
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r14, r15, r4, r0, r3)
            goto L_0x04ce
        L_0x0096:
            r4 = -4
            r3 = r0
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            r4 = 1
            android.view.ViewGroup r1 = m21644c(r3, r8, r9, r1, r4)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "playAudioFileByXWeb contentView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            r1 = -4
            r4 = 0
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r14, r15, r1, r0, r4)
            goto L_0x04ce
        L_0x00ad:
            r4 = 0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r11, r2)
            boolean r2 = f56719a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r6, r2)
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r2 = r7.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d6
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x00d6
            r0.put(r5, r2)
        L_0x00d6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "startPlay, version: 1, token: "
            r2.append(r5)
            java.lang.String r5 = "null"
            if (r10 == 0) goto L_0x00e7
            r6 = r10
            goto L_0x00e8
        L_0x00e7:
            r6 = r5
        L_0x00e8:
            r2.append(r6)
            java.lang.String r6 = ", fileExt: "
            r2.append(r6)
            if (r14 == 0) goto L_0x00f3
            r5 = r14
        L_0x00f3:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "XFilesAudioPlayerLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            long r24 = com.tencent.xweb.FileReaderHelper.reportFileSize(r13, r14)
            com.tencent.xweb.FileReaderHelper$ReaderType r2 = com.tencent.xweb.FileReaderHelper.ReaderType.XWEB
            java.lang.String r2 = r2.name()
            com.tencent.xweb.FileReaderHelper.reportPVUV(r14, r2)
            com.tencent.xweb.FileReaderHelper$OpenFileReportData r12 = new com.tencent.xweb.FileReaderHelper$OpenFileReportData
            int r17 = com.tencent.xweb.FileReaderHelper.getOpenFileScene(r0)
            r22 = -1
            int r0 = com.tencent.xweb.FileReaderHelper.getOpenFileFrom(r0)
            java.lang.String r23 = com.tencent.xweb.FileReaderHelper.convertOpenFileFrom(r0)
            java.lang.String r21 = "XFilesAudioPlayer"
            r16 = r12
            r18 = r14
            r19 = r24
            r16.<init>(r17, r18, r19, r21, r22, r23)
            long r6 = com.tencent.xweb.FileReaderHelper.getCurrentProcessMemory(r3)
            long r4 = java.lang.System.currentTimeMillis()
            r12.markStart(r6, r4)
            com.tencent.xweb.FileReaderHelper.reportOpenFile(r12)
            com.tencent.mm.xwebutil.k r0 = com.tencent.p014mm.xwebutil.C19905j.f56734a
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "startPlay need finish pre player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            com.tencent.mm.xwebutil.k r0 = com.tencent.p014mm.xwebutil.C19905j.f56734a
            if (r0 != 0) goto L_0x0144
            goto L_0x014b
        L_0x0144:
            java.lang.String r2 = r0.f56746f
            java.lang.String r0 = r0.f56744d
            com.tencent.p014mm.xwebutil.C19905j.m21649a(r2, r0)
        L_0x014b:
            boolean r0 = com.tencent.xweb.FileReaderHelper.isAudioFormat(r14)
            if (r0 != 0) goto L_0x015d
            java.lang.String r0 = "startPlay failed, file not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = -7
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r14, r15, r0, r3, r12)
            goto L_0x04ce
        L_0x015d:
            java.io.File r0 = new java.io.File
            r0.<init>(r13)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0174
            java.lang.String r0 = "startPlay failed, file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = -6
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r14, r15, r0, r3, r12)
            goto L_0x04ce
        L_0x0174:
            r0 = 0
            r9 = 0
            r16 = 0
        L_0x0178:
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x01b1
            android.view.View r2 = r1.getChildAt(r0)
            if (r2 != 0) goto L_0x0187
            r33 = r4
            goto L_0x01ac
        L_0x0187:
            r33 = r4
            java.lang.Object r4 = r2.getTag()
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L_0x0192
            goto L_0x01ac
        L_0x0192:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "view_tag_toolbar"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x01a0
            r16 = r2
            goto L_0x01ac
        L_0x01a0:
            java.lang.String r5 = "view_tag_relative_layout"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x01ac
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r9 = r2
        L_0x01ac:
            int r0 = r0 + 1
            r4 = r33
            goto L_0x0178
        L_0x01b1:
            r33 = r4
            if (r9 != 0) goto L_0x01c9
            boolean r0 = r1 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x01bd
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r2 = r1
            goto L_0x01ca
        L_0x01bd:
            java.lang.String r0 = "startPlay failed, can not find layout"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            r0 = -4
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r14, r15, r0, r3, r12)
            goto L_0x04ce
        L_0x01c9:
            r2 = r9
        L_0x01ca:
            if (r16 != 0) goto L_0x01d2
            java.lang.String r0 = "startPlay not set toolbar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x01d2:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0341 }
            androidx.appcompat.app.AppCompatActivity r1 = r3.getContext()     // Catch:{ all -> 0x0341 }
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)     // Catch:{ all -> 0x0341 }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ all -> 0x0341 }
            androidx.appcompat.app.AppCompatActivity r5 = r3.getContext()     // Catch:{ all -> 0x0341 }
            r4.<init>(r5)     // Catch:{ all -> 0x0341 }
            r5 = 2131498400(0x7f0c15a0, float:1.862042E38)
            r9 = 0
            android.view.View r1 = r1.inflate(r5, r4, r9)     // Catch:{ all -> 0x0341 }
            r4 = r1
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4     // Catch:{ all -> 0x0341 }
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0341 }
            r5 = -1
            r1.<init>(r5, r5)     // Catch:{ all -> 0x0341 }
            r9 = 10
            r1.addRule(r9, r5)     // Catch:{ all -> 0x0341 }
            r9 = 9
            r1.addRule(r9, r5)     // Catch:{ all -> 0x0341 }
            r4.setLayoutParams(r1)     // Catch:{ all -> 0x0341 }
            r2.addView(r4)     // Catch:{ all -> 0x0341 }
            r1 = 2131315673(0x7f094bd9, float:1.8249806E38)
            android.view.View r1 = r4.findViewById(r1)     // Catch:{ all -> 0x0341 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x0341 }
            r1.setText(r8)     // Catch:{ all -> 0x0341 }
            r1 = 2131306702(0x7f0928ce, float:1.823161E38)
            android.view.View r1 = r4.findViewById(r1)     // Catch:{ all -> 0x0341 }
            r5 = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5     // Catch:{ all -> 0x0341 }
            com.tencent.mm.xwebutil.f r1 = new com.tencent.mm.xwebutil.f     // Catch:{ all -> 0x0341 }
            r1.<init>(r10)     // Catch:{ all -> 0x0341 }
            r5.setOnClickListener(r1)     // Catch:{ all -> 0x0341 }
            r1 = 2131316256(0x7f094e20, float:1.8250988E38)
            android.view.View r1 = r4.findViewById(r1)     // Catch:{ all -> 0x0341 }
            r9 = r1
            com.tencent.mm.xwebutil.XWebAudioPlayerProgress r9 = (com.tencent.p014mm.xwebutil.XWebAudioPlayerProgress) r9     // Catch:{ all -> 0x0341 }
            com.tencent.mm.xwebutil.g r1 = new com.tencent.mm.xwebutil.g     // Catch:{ all -> 0x0341 }
            r1.<init>(r10)     // Catch:{ all -> 0x0341 }
            r9.setProgressCallback(r1)     // Catch:{ all -> 0x0341 }
            com.tencent.mm.xwebutil.h r1 = new com.tencent.mm.xwebutil.h     // Catch:{ all -> 0x0341 }
            r1.<init>(r10)     // Catch:{ all -> 0x0341 }
            nj.c r15 = new nj.c     // Catch:{ all -> 0x0339 }
            r15.<init>(r0)     // Catch:{ all -> 0x0339 }
            r38 = r6
            nj.c$b r6 = r15.f293268b     // Catch:{ all -> 0x0339 }
            if (r6 == 0) goto L_0x024c
            nj.d r6 = (p206nj.C100118d) r6     // Catch:{ all -> 0x0339 }
            r6.f293271c = r1     // Catch:{ all -> 0x0339 }
        L_0x024c:
            com.tencent.mm.xwebutil.i r7 = new com.tencent.mm.xwebutil.i     // Catch:{ all -> 0x0339 }
            r7.<init>(r10)     // Catch:{ all -> 0x0339 }
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ all -> 0x0339 }
            r6.<init>()     // Catch:{ all -> 0x0339 }
            r36 = r1
            java.lang.String r1 = "android.intent.action.HEADSET_PLUG"
            r6.addAction(r1)     // Catch:{ all -> 0x0339 }
            java.lang.String r1 = "android.media.AUDIO_BECOMING_NOISY"
            r6.addAction(r1)     // Catch:{ all -> 0x0339 }
            java.lang.String r1 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            r6.addAction(r1)     // Catch:{ all -> 0x0339 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
            r1.<init>()     // Catch:{ all -> 0x0339 }
            r40 = r15
            java.lang.String r15 = "startPlay registerReceiver, activity = "
            r1.append(r15)     // Catch:{ all -> 0x0339 }
            int r15 = r3.hashCode()     // Catch:{ all -> 0x0339 }
            r1.append(r15)     // Catch:{ all -> 0x0339 }
            java.lang.String r15 = ", receiver = "
            r1.append(r15)     // Catch:{ all -> 0x0339 }
            int r15 = r7.hashCode()     // Catch:{ all -> 0x0339 }
            r1.append(r15)     // Catch:{ all -> 0x0339 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0339 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ all -> 0x0339 }
            r3.registerReceiver(r7, r6)     // Catch:{ all -> 0x0339 }
            com.tencent.xweb.CommandCfgPlugin r1 = com.tencent.xweb.CommandCfgPlugin.getInstance()     // Catch:{ all -> 0x0339 }
            com.tencent.xweb.FileReaderHelper$AudioPlayerStrategy r26 = r1.getAudioPlayerStrategy(r14)     // Catch:{ all -> 0x0339 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
            r1.<init>()     // Catch:{ all -> 0x0339 }
            java.lang.String r6 = "startPlay get playerStrategy = "
            r1.append(r6)     // Catch:{ all -> 0x0339 }
            java.lang.String r6 = r26.name()     // Catch:{ all -> 0x0339 }
            r1.append(r6)     // Catch:{ all -> 0x0339 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0339 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ all -> 0x0339 }
            com.tencent.thumbplayer.api.ITPPlayer r27 = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(r0)     // Catch:{ all -> 0x0339 }
            com.tencent.mm.xwebutil.j$b r15 = new com.tencent.mm.xwebutil.j$b     // Catch:{ all -> 0x0339 }
            r15.<init>(r10, r12)     // Catch:{ all -> 0x0339 }
            com.tencent.mm.xwebutil.k r28 = new com.tencent.mm.xwebutil.k     // Catch:{ all -> 0x0339 }
            r0 = r28
            r21 = r36
            r1 = r3
            r6 = r3
            r3 = r16
            r16 = r33
            r18 = r38
            r29 = r6
            r6 = r9
            r22 = r7
            r7 = r13
            r8 = r35
            r9 = r14
            r10 = r37
            r30 = r11
            r31 = r12
            r11 = r24
            r24 = r13
            r25 = r14
            r13 = r16
            r20 = r40
            r32 = r15
            r15 = r18
            r17 = r26
            r18 = r27
            r19 = r32
            r23 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x032f }
            com.tencent.p014mm.xwebutil.C19905j.f56734a = r28     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "startPlay tryPlayInner"
            r1 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x0325 }
            r0 = -1
            r33 = r27
            r34 = r24
            r35 = r25
            r36 = r32
            r37 = r26
            r38 = r0
            boolean r0 = com.tencent.p014mm.xwebutil.C19905j.m21653e(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0325 }
            if (r0 != 0) goto L_0x04ce
            java.lang.String r0 = "startPlay failed, tryPlayInner failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ all -> 0x0325 }
            r0 = -10
            r3 = r41
            r4 = r25
            r2 = r29
            r5 = r31
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r4, r3, r0, r2, r5)     // Catch:{ all -> 0x0323 }
            goto L_0x04ce
        L_0x0323:
            r0 = move-exception
            goto L_0x0347
        L_0x0325:
            r0 = move-exception
            r3 = r41
            r4 = r25
            r2 = r29
        L_0x032c:
            r5 = r31
            goto L_0x0347
        L_0x032f:
            r0 = move-exception
            r3 = r41
            r4 = r25
            r2 = r29
            r1 = r30
            goto L_0x032c
        L_0x0339:
            r0 = move-exception
            r2 = r3
            r1 = r11
            r5 = r12
            r4 = r14
            r3 = r41
            goto L_0x0347
        L_0x0341:
            r0 = move-exception
            r2 = r3
            r1 = r11
            r5 = r12
            r4 = r14
            r3 = r15
        L_0x0347:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "startPlay error: "
            r6.append(r7)
            java.lang.String r7 = r0.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            java.lang.String r1 = "startPlay error "
            com.tencent.p014mm.xwebutil.C19905j.m21652d(r1, r0)
            r0 = -9
            com.tencent.p014mm.xwebutil.C19905j.m21651c(r4, r3, r0, r2, r5)
            goto L_0x04ce
        L_0x036d:
            r24 = r13
            r4 = r14
            r3 = r15
            com.tencent.xweb.CommandCfgPlugin r13 = com.tencent.xweb.CommandCfgPlugin.getInstance()
            r14 = 1
            boolean r13 = r13.canDownloadWhenNotInstall(r14)
            boolean r14 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            r15 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            if (r14 != 0) goto L_0x0390
            java.lang.String r0 = "readFileByXWeb not mmactivity, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            if (r3 == 0) goto L_0x04ce
            r3.onReceiveValue(r15)
            goto L_0x04ce
        L_0x0390:
            r14 = r0
            com.tencent.mm.ui.MMActivity r14 = (com.tencent.p014mm.p136ui.MMActivity) r14
            r0 = 0
            android.view.ViewGroup r8 = m21644c(r14, r8, r9, r1, r0)
            if (r8 != 0) goto L_0x03a6
            java.lang.String r0 = "readFileByXWeb contentView is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            if (r3 == 0) goto L_0x04ce
            r3.onReceiveValue(r15)
            goto L_0x04ce
        L_0x03a6:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            com.tencent.xweb.CommandCfgPlugin r0 = com.tencent.xweb.CommandCfgPlugin.getInstance()
            r1 = 1
            boolean r0 = r0.canDownloadWhenPluginError(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "extra_param_can_download_when_plugin_error"
            r15.put(r1, r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r15.put(r11, r0)
            boolean r0 = f56719a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r15.put(r6, r0)
            s00.d$a r0 = f56720b
            if (r0 == 0) goto L_0x0405
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f63184a
            if (r0 == 0) goto L_0x0405
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0405
            s00.d$a r0 = f56720b
            int r1 = r0.f63185b
            int r2 = r0.f63186c
            int r1 = r1 + r2
            int r0 = r0.f63187d
            int r1 = r1 + r0
            android.content.res.Resources r0 = r14.getResources()
            if (r0 != 0) goto L_0x03ed
        L_0x03eb:
            r2 = 1
            goto L_0x03fb
        L_0x03ed:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 != 0) goto L_0x03f4
            goto L_0x03eb
        L_0x03f4:
            float r1 = (float) r1
            r2 = 1
            float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
            int r1 = (int) r0
        L_0x03fb:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "extra_param_bottom_bar_total_height_px"
            r15.put(r1, r0)
            goto L_0x0406
        L_0x0405:
            r2 = 1
        L_0x0406:
            if (r7 == 0) goto L_0x04b5
            java.lang.Object r0 = r7.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04b5
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04b5
            r15.put(r5, r0)
            java.lang.String r1 = "doc"
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch:{ all -> 0x049c }
            if (r1 != 0) goto L_0x043e
            java.lang.String r1 = "docx"
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch:{ all -> 0x049c }
            if (r1 != 0) goto L_0x043e
            java.lang.String r1 = "xls"
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch:{ all -> 0x049c }
            if (r1 != 0) goto L_0x043e
            java.lang.String r1 = "xlsx"
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch:{ all -> 0x049c }
            if (r1 == 0) goto L_0x043c
            goto L_0x043e
        L_0x043c:
            r1 = 0
            goto L_0x043f
        L_0x043e:
            r1 = 1
        L_0x043f:
            java.lang.String r5 = "7"
            boolean r5 = r0.equalsIgnoreCase(r5)     // Catch:{ all -> 0x049c }
            if (r5 != 0) goto L_0x0450
            java.lang.String r5 = "10"
            boolean r0 = r0.equalsIgnoreCase(r5)     // Catch:{ all -> 0x049c }
            if (r0 != 0) goto L_0x0450
            goto L_0x0451
        L_0x0450:
            r2 = 0
        L_0x0451:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x049c }
            r0.<init>()     // Catch:{ all -> 0x049c }
            java.lang.String r5 = "custom_menu_id"
            r6 = 0
            r0.put(r5, r6)     // Catch:{ all -> 0x049c }
            java.lang.String r5 = "custom_menu_display"
            r6 = 2131840369(0x7f114d71, float:1.9314016E38)
            java.lang.String r6 = r14.getString(r6)     // Catch:{ all -> 0x049c }
            r0.put(r5, r6)     // Catch:{ all -> 0x049c }
            java.lang.String r5 = "custom_menu_sub_display"
            r6 = 2131840370(0x7f114d72, float:1.9314018E38)
            java.lang.String r6 = r14.getString(r6)     // Catch:{ all -> 0x049c }
            r0.put(r5, r6)     // Catch:{ all -> 0x049c }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x049c }
            r5.<init>()     // Catch:{ all -> 0x049c }
            r5.put(r0)     // Catch:{ all -> 0x049c }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x049c }
            r0.<init>()     // Catch:{ all -> 0x049c }
            java.lang.String r6 = "custom_menu_array"
            r0.put(r6, r5)     // Catch:{ all -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x049c }
            if (r2 == 0) goto L_0x04b5
            if (r1 == 0) goto L_0x04b5
            if (r0 == 0) goto L_0x04b5
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x049c }
            if (r1 != 0) goto L_0x04b5
            java.lang.String r1 = "extra_param_custom_menu"
            r15.put(r1, r0)     // Catch:{ all -> 0x049c }
            goto L_0x04b5
        L_0x049c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "readFileByXWeb jsonObject error, msg: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x04b5:
            com.tencent.xweb.XFileSdk$ViewType r5 = com.tencent.xweb.XFileSdk.ViewType.ListView
            com.tencent.mm.xwebutil.b r11 = new com.tencent.mm.xwebutil.b
            r11.<init>(r9)
            com.tencent.mm.xwebutil.c r9 = new com.tencent.mm.xwebutil.c
            r9.<init>(r3)
            r0 = r24
            r1 = r4
            r2 = r37
            r3 = r13
            r4 = r15
            r6 = r14
            r7 = r8
            r8 = r11
            com.tencent.xweb.XFileSdk.readFile(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x04ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.xwebutil.C19894d.m21645d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, android.webkit.ValueCallback, android.webkit.ValueCallback, boolean):void");
    }

    /* renamed from: e */
    public static void m21646e(MMActivity mMActivity, String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendFileToFriend, start filePath: ");
        String str4 = str;
        sb.append(str);
        Log.m105924i("XFilesReaderLogic", sb.toString());
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("desc_title", str2);
        intent.putExtra("Retr_Msg_Type", 3);
        MMActivity mMActivity2 = mMActivity;
        C88144b.m109803u(mMActivity, ".ui.transmit.SelectConversationUI", intent, 1, new C19898c(str, str2, str3, j, mMActivity));
    }

    /* renamed from: f */
    public static void m21647f(Context context, String str, String str2, int i) {
        if (context == null || str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            Log.m105920e("XFilesReaderLogic", "sendResult wrong param");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("MINIQB_OPEN_RET");
        intent.putExtra("op_type", "NOTIFY_RET");
        intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, str);
        intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, str2);
        intent.putExtra("MINIQB_OPEN_RET_VAL", i == 0);
        context.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
    }

    /* renamed from: g */
    public static void m21648g(MMActivity mMActivity, int i) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            Window window = mMActivity.getWindow();
            if (window != null) {
                window.clearFlags(201326592);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
                if (i2 >= 23) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
                }
            }
        } catch (Exception e) {
            Log.m105921e("XFilesReaderLogic", "updateStatusBarToDarkMode error ", e);
        }
    }
}
