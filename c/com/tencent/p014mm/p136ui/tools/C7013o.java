package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import java.io.IOException;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.ui.tools.o */
public class C7013o {

    /* renamed from: com.tencent.mm.ui.tools.o$a */
    public class C7014a extends AsyncTask<Integer, Integer, Integer> {

        /* renamed from: a */
        public String f24760a;

        /* renamed from: b */
        public ProgressDialog f24761b;

        /* renamed from: c */
        public Uri f24762c;

        /* renamed from: d */
        public boolean f24763d;

        /* renamed from: e */
        public final /* synthetic */ Intent f24764e;

        /* renamed from: f */
        public final /* synthetic */ Activity f24765f;

        /* renamed from: g */
        public final /* synthetic */ String f24766g;

        /* renamed from: h */
        public final /* synthetic */ C7017c f24767h;

        /* renamed from: i */
        public final /* synthetic */ Intent f24768i;

        /* renamed from: j */
        public final /* synthetic */ int f24769j;

        /* renamed from: com.tencent.mm.ui.tools.o$a$a */
        public class C7015a implements DialogInterface.OnCancelListener {
            public C7015a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C7014a.this.f24763d = true;
            }
        }

        public C7014a(Intent intent, Activity activity, String str, C7017c cVar, Intent intent2, int i) {
            this.f24764e = intent;
            this.f24765f = activity;
            this.f24766g = str;
            this.f24767h = cVar;
            this.f24768i = intent2;
            this.f24769j = i;
        }

        public Object doInBackground(Object[] objArr) {
            Integer[] numArr = (Integer[]) objArr;
            try {
                Uri uri = this.f24762c;
                if (uri == null) {
                    return null;
                }
                this.f24760a = C7013o.m7261c(this.f24766g, BitmapUtil.getBitmapNative(uri));
                return null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e, "doInBackground", new Object[0]);
                return null;
            }
        }

        public void onPostExecute(Object obj) {
            Integer num = (Integer) obj;
            if (this.f24763d || Util.isNullOrNil(this.f24760a)) {
                Log.m105921e("MicroMsg.AsyncObtainImage", "onPostExecute error, filePath:%s", this.f24760a);
            } else {
                C7017c cVar = this.f24767h;
                if (cVar != null) {
                    this.f24768i.putExtra("CropImage_OutputPath", cVar.mo8052a(this.f24760a));
                }
                this.f24768i.putExtra("CropImage_ImgPath", this.f24760a);
                Activity activity = this.f24765f;
                Intent intent = this.f24768i;
                int i = this.f24769j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                aVar.mo10233c(intent);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/ui/tools/AsyncObtainImage$2", "onPostExecute", "(Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            this.f24761b.dismiss();
        }

        public void onPreExecute() {
            try {
                this.f24762c = this.f24764e.getData();
                this.f24763d = false;
                Activity activity = this.f24765f;
                this.f24761b = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), this.f24765f.getString(C0966R.string.f8025zl), true, true, new C7015a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e, "onPreExecute", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.o$b */
    public class C7016b implements BitmapUtil.ImageWriteOSCallback {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f24771a;

        public C7016b(Bitmap bitmap) {
            this.f24771a = bitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[SYNTHETIC, Splitter:B:13:0x001b] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0021 A[SYNTHETIC, Splitter:B:19:0x0021] */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callback(java.io.OutputStream r4) {
            /*
                r3 = this;
                r0 = 0
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
                r1.<init>(r4)     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
                android.graphics.Bitmap r4 = r3.f24771a     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
                android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
                r2 = 100
                r4.compress(r0, r2, r1)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
                r1.close()     // Catch:{ all -> 0x0024 }
                goto L_0x0024
            L_0x0013:
                r4 = move-exception
                r0 = r1
                goto L_0x0019
            L_0x0016:
                r0 = r1
                goto L_0x001f
            L_0x0018:
                r4 = move-exception
            L_0x0019:
                if (r0 == 0) goto L_0x001e
                r0.close()     // Catch:{ all -> 0x001e }
            L_0x001e:
                throw r4
            L_0x001f:
                if (r0 == 0) goto L_0x0024
                r0.close()     // Catch:{ all -> 0x0024 }
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.C7013o.C7016b.callback(java.io.OutputStream):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.o$c */
    public interface C7017c {
        /* renamed from: a */
        String mo8052a(String str);
    }

    /* renamed from: a */
    public static void m7259a(Activity activity, Intent intent, Intent intent2, String str, int i, C7017c cVar) {
        Intent intent3 = intent;
        Intent intent4 = intent2;
        C7017c cVar2 = cVar;
        boolean z = true;
        if (intent3 == null || intent.getData() == null) {
            Object[] objArr = new Object[1];
            if (intent3 != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.AsyncObtainImage", "param error, %b", objArr);
        } else if (!intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
            String b = m7260b(activity, intent3, str);
            Log.m105925i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", b);
            if (!Util.isNullOrNil(b)) {
                if (cVar2 != null) {
                    intent4.putExtra("CropImage_OutputPath", cVar2.mo8052a(b));
                }
                intent4.putExtra("CropImage_ImgPath", b);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                aVar.mo10233c(intent4);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/ui/tools/AsyncObtainImage", "asyncResolvePhoto", "(Landroid/app/Activity;Landroid/content/Intent;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/ui/tools/AsyncObtainImage$IOnGenOutputPath;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        } else {
            new C7014a(intent, activity, str, cVar, intent2, i).execute(new Integer[]{0});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0127, code lost:
        if (r3 == false) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0171  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7260b(android.content.Context r9, android.content.Intent r10, java.lang.String r11) {
        /*
            r0 = 0
            java.lang.String r1 = "MicroMsg.AsyncObtainImage"
            if (r9 == 0) goto L_0x0180
            if (r10 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x000b
            goto L_0x0180
        L_0x000b:
            java.lang.String r2 = r10.toURI()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.ContentResolver r3 = r9.getContentResolver()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r2
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            r3 = 0
            if (r9 == 0) goto L_0x0075
            int r4 = r9.getCount()
            if (r4 <= 0) goto L_0x0075
            java.lang.String r4 = "resolve photo from cursor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "content://com.google.android.gallery3d"
            boolean r2 = r2.startsWith(r4)     // Catch:{ Exception -> 0x006b }
            if (r2 == 0) goto L_0x0048
            android.net.Uri r10 = r10.getData()     // Catch:{ Exception -> 0x006b }
            android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((android.net.Uri) r10)     // Catch:{ Exception -> 0x006b }
            java.lang.String r10 = m7261c(r11, r10)     // Catch:{ Exception -> 0x006b }
            goto L_0x016f
        L_0x0048:
            r9.moveToFirst()     // Catch:{ Exception -> 0x006b }
            java.lang.String r10 = "_data"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = r9.getString(r10)     // Catch:{ Exception -> 0x006b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r10.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r11 = "photo from resolver, path:"
            r10.append(r11)     // Catch:{ Exception -> 0x006b }
            r10.append(r0)     // Catch:{ Exception -> 0x006b }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x006b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)     // Catch:{ Exception -> 0x006b }
            goto L_0x013f
        L_0x006b:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r2 = "resolve photo error."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r2, r11)
            goto L_0x013f
        L_0x0075:
            android.net.Uri r2 = r10.getData()
            if (r2 == 0) goto L_0x0143
            android.net.Uri r11 = r10.getData()
            java.lang.String r11 = r11.getPath()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x00c6
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r4 = r2.getPath()
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r3, r3)
            java.lang.String r5 = r2.getPath()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x00ad
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r4)
            android.net.Uri r2 = r2.build()
        L_0x00ad:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r0)
            boolean r4 = r2.mo177810a()
            if (r4 != 0) goto L_0x00bb
            r2 = 0
            goto L_0x00c3
        L_0x00bb:
            com.tencent.mm.vfs.FileSystem$c r4 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r4.mo119948x(r2)
        L_0x00c3:
            if (r2 != 0) goto L_0x00c6
            r11 = r0
        L_0x00c6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "photo file from data, path:"
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 == 0) goto L_0x0141
            android.net.Uri r10 = r10.getData()
            java.lang.String r10 = r10.getHost()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x012a
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            java.lang.String r2 = r11.getPath()
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r11.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0112
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r2)
            android.net.Uri r11 = r11.build()
        L_0x0112:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r11 = r2.mo177799l(r11, r0)
            boolean r2 = r11.mo177810a()
            if (r2 != 0) goto L_0x011f
            goto L_0x0127
        L_0x011f:
            com.tencent.mm.vfs.FileSystem$c r2 = r11.f348991a
            java.lang.String r11 = r11.f348992b
            boolean r3 = r2.mo119948x(r11)
        L_0x0127:
            if (r3 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r0 = r10
        L_0x012b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "photo file from data, host:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
        L_0x013f:
            r10 = r0
            goto L_0x016f
        L_0x0141:
            r10 = r11
            goto L_0x016f
        L_0x0143:
            java.lang.String r2 = r10.getAction()
            if (r2 == 0) goto L_0x0175
            java.lang.String r2 = r10.getAction()
            java.lang.String r4 = "inline-data"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0175
            android.os.Bundle r10 = r10.getExtras()
            java.lang.String r0 = "data"
            java.lang.Object r10 = r10.get(r0)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.String r10 = m7261c(r11, r10)
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r10
            java.lang.String r0 = "resolve photo from action-inline-data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r11)
        L_0x016f:
            if (r9 == 0) goto L_0x0174
            r9.close()
        L_0x0174:
            return r10
        L_0x0175:
            if (r9 == 0) goto L_0x017a
            r9.close()
        L_0x017a:
            java.lang.String r9 = "resolve photo from intent failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
            return r0
        L_0x0180:
            java.lang.String r9 = "resolvePhotoFromIntent fail, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.C7013o.m7260b(android.content.Context, android.content.Intent, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m7261c(String str, Bitmap bitmap) {
        try {
            String str2 = str + (C90193h.m112878f(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg");
            C86009m1 m1Var = new C86009m1(str2);
            if (!m1Var.mo119967g()) {
                m1Var.mo119964e();
            }
            BitmapUtil.getImageWriteOutputStream(m1Var.mo119971i(), (BitmapUtil.ImageWriteOSCallback) new C7016b(bitmap));
            Log.m105924i("MicroMsg.AsyncObtainImage", "photo image from data, path:" + str2);
            return str2;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AsyncObtainImage", e, "saveBmp Error.", new Object[0]);
            return null;
        }
    }
}
