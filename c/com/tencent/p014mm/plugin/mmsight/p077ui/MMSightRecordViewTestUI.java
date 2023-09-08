package com.tencent.p014mm.plugin.mmsight.p077ui;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tavkit.component.TAVExporter;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI */
public class MMSightRecordViewTestUI extends MMActivity {

    /* renamed from: d */
    public MMSightRecordView f53166d;

    /* renamed from: e */
    public int f53167e = TAVExporter.VIDEO_EXPORT_WIDTH;

    /* renamed from: f */
    public float f53168f = 0.67f;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$a */
    public class C18939a implements MenuItem.OnMenuItemClickListener {
        public C18939a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMSightRecordViewTestUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$b */
    public class C18940b implements MMSightRecordView.C18932a {
        public C18940b(MMSightRecordViewTestUI mMSightRecordViewTestUI) {
        }

        /* renamed from: a */
        public void mo22127a(byte[] bArr, int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$c */
    public class C18941c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$c$a */
        public class C18942a implements MMSightRecordView.C18937g {
            public C18942a() {
            }

            /* renamed from: a */
            public void mo22142a() {
            }

            /* renamed from: b */
            public void mo22143b(Bitmap bitmap) {
                if (bitmap != null) {
                    ((ImageView) MMSightRecordViewTestUI.this.findViewById(C0966R.C0970id.f4k)).setImageBitmap(bitmap);
                }
            }
        }

        public C18941c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMSightRecordView mMSightRecordView = MMSightRecordViewTestUI.this.f53166d;
            mMSightRecordView.f53165d.mo24069S(new C18942a(), true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$d */
    public class C18943d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$d$a */
        public class C18944a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$d$a$a */
            public class C18945a implements MMSightRecordView.C18938h {
                public C18945a() {
                }

                /* renamed from: a */
                public void mo22144a(boolean z) {
                    MMSightRecordViewTestUI mMSightRecordViewTestUI = MMSightRecordViewTestUI.this;
                    C76701a.makeText((Context) mMSightRecordViewTestUI, (CharSequence) "record finish, error: " + z, 0).show();
                }
            }

            public C18944a() {
            }

            public void run() {
                MMSightRecordView mMSightRecordView = MMSightRecordViewTestUI.this.f53166d;
                mMSightRecordView.f53165d.mo24067Q(new C18945a());
            }
        }

        public C18943d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMSightRecordViewTestUI.this.f53166d.f53165d.mo24066P(true);
            MMHandlerThread.postToMainThreadDelayed(new C18944a(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$e */
    public class C18946e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f53175d;

        public C18946e(TextView textView) {
            this.f53175d = textView;
        }

        public void run() {
            this.f53175d.setText("");
            this.f53175d.append(String.format("picture size: %s, ratio: %s\n", new Object[]{MMSightRecordViewTestUI.this.f53166d.getPictureSize(), Float.valueOf(((float) Math.min(MMSightRecordViewTestUI.this.f53166d.getPictureSize().x, MMSightRecordViewTestUI.this.f53166d.getPictureSize().y)) / ((float) Math.max(MMSightRecordViewTestUI.this.f53166d.getPictureSize().x, MMSightRecordViewTestUI.this.f53166d.getPictureSize().y)))}));
            this.f53175d.append(String.format("video size: %s, ratio: %s\n", new Object[]{MMSightRecordViewTestUI.this.f53166d.getVideoSize(), Float.valueOf(((float) Math.min(MMSightRecordViewTestUI.this.f53166d.getVideoSize().x, MMSightRecordViewTestUI.this.f53166d.getVideoSize().y)) / ((float) Math.max(MMSightRecordViewTestUI.this.f53166d.getVideoSize().x, MMSightRecordViewTestUI.this.f53166d.getVideoSize().y)))}));
            this.f53175d.append(String.format("preview size limit: %s\n", new Object[]{Integer.valueOf(MMSightRecordViewTestUI.this.f53167e)}));
            this.f53175d.append(String.format("display ratio: %s\n", new Object[]{Float.valueOf(MMSightRecordViewTestUI.this.f53168f)}));
            this.f53175d.append(String.format("view size: %s, ratio: %s\n", new Object[]{new Point(MMSightRecordViewTestUI.this.f53166d.getWidth(), MMSightRecordViewTestUI.this.f53166d.getHeight()), Float.valueOf(((float) MMSightRecordViewTestUI.this.f53166d.getWidth()) / ((float) MMSightRecordViewTestUI.this.f53166d.getHeight()))}));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI$f */
    public class C18947f implements View.OnClickListener {
        public C18947f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMSightRecordViewTestUI.this.f53166d.f53165d.mo24068R();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bfy;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C18939a());
        MMSightRecordView mMSightRecordView = (MMSightRecordView) findViewById(C0966R.C0970id.iig);
        this.f53166d = mMSightRecordView;
        mMSightRecordView.setDisplayRatio(this.f53168f);
        this.f53166d.setPreviewSizeLimit(this.f53167e);
        this.f53166d.f53165d.mo24063M(100000, 4800000, 30, 64000, 44100);
        MMSightRecordView mMSightRecordView2 = this.f53166d;
        mMSightRecordView2.setVideoFilePath(C112760b.m154195C() + "mmsighttest.mp4");
        this.f53166d.setClipPictureSize(true);
        this.f53166d.setClipVideoSize(true);
        this.f53166d.f53165d.mo24055E();
        this.f53166d.setFlashMode(3);
        this.f53166d.setFrameDataCallback(new C18940b(this));
        this.f53166d.f53165d.mo24065O();
        this.f53166d.f53165d.mo24082s();
        findViewById(C0966R.C0970id.kez).setOnClickListener(new C18941c());
        findViewById(C0966R.C0970id.k0k).setOnClickListener(new C18943d());
        MMHandlerThread.postToMainThreadDelayed(new C18946e((TextView) findViewById(C0966R.C0970id.bzj)), 1000);
        findViewById(C0966R.C0970id.kax).setOnClickListener(new C18947f());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f53166d.f53165d.mo24083t();
    }
}
