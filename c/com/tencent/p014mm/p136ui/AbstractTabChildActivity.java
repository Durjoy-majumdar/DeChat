package com.tencent.p014mm.p136ui;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.AbstractTabChildActivity */
public abstract class AbstractTabChildActivity extends AppCompatActivity {

    /* renamed from: com.tencent.mm.ui.AbstractTabChildActivity$AbStractTabFragment */
    public static abstract class AbStractTabFragment extends MMFragment implements C74940w0 {

        /* renamed from: d */
        public boolean f214116d;

        /* renamed from: e */
        public Bundle f214117e;

        /* renamed from: f */
        public boolean f214118f;

        /* renamed from: g */
        public boolean f214119g;

        /* renamed from: h */
        public boolean f214120h = false;

        /* renamed from: i */
        public boolean f214121i = false;

        /* renamed from: j */
        public boolean f214122j = false;

        /* renamed from: A */
        public void mo101233A() {
            mo25922t();
            this.f214118f = true;
        }

        /* renamed from: D */
        public void mo25873D() {
        }

        /* renamed from: E */
        public void mo101234E() {
            this.f214121i = true;
        }

        /* renamed from: K */
        public abstract void mo101235K(Bundle bundle);

        /* renamed from: L */
        public abstract void mo101236L();

        /* renamed from: M */
        public abstract void mo101237M();

        /* renamed from: N */
        public abstract void mo101238N();

        /* renamed from: O */
        public abstract void mo101239O();

        /* renamed from: P */
        public abstract void mo101240P();

        /* renamed from: Q */
        public abstract void mo101241Q();

        public int getLayoutId() {
            return 0;
        }

        /* renamed from: l */
        public void mo101242l() {
            Log.m105925i("MicroMsg.INIT", "deliverOnTabResume %s", Boolean.valueOf(this.f214120h));
            if (this.f214120h) {
                Log.m105924i("MicroMsg.INIT", "checkNeedRecreate");
                if (this.f214116d) {
                    mo101235K(this.f214117e);
                    this.f214116d = false;
                }
                this.f214122j = true;
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f214118f) {
                    this.f214118f = false;
                    mo25918r();
                }
                mo101238N();
                Log.m105918d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - currentTimeMillis));
                this.f214119g = true;
                this.f214120h = false;
            }
        }

        public void onActivityCreated(Bundle bundle) {
            super.onActivityCreated(bundle);
            this.f214116d = true;
            this.f214117e = bundle;
        }

        public void onDestroy() {
            if (this.f214122j) {
                mo101236L();
            }
            super.onDestroy();
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4 && keyEvent.getAction() == 0) {
                return false;
            }
            return super.onKeyDown(i, keyEvent);
        }

        public void onPause() {
            super.onPause();
            Log.m105924i("MicroMsg.INIT", "onPause");
            if (this.f214119g) {
                long currentTimeMillis = System.currentTimeMillis();
                mo101237M();
                Log.m105918d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - currentTimeMillis));
                this.f214119g = false;
            }
        }

        public void onResume() {
            Log.m105924i("MicroMsg.INIT", "onResume");
            super.onResume();
            Log.m105925i("MicroMsg.INIT", "resumeWithVerify %s", Boolean.valueOf(this.f214120h));
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null && instance.f214342r) {
                this.f214120h = true;
                if (this.f214121i) {
                    mo101242l();
                    this.f214121i = false;
                }
            }
        }

        public void onStart() {
            super.onStart();
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null && instance.f214342r) {
                mo101239O();
            }
        }

        public void onStop() {
            super.onStop();
            mo101240P();
        }

        /* renamed from: r */
        public abstract void mo25918r();

        public boolean supportNavigationSwipeBack() {
            return false;
        }

        /* renamed from: t */
        public abstract void mo25922t();
    }
}
