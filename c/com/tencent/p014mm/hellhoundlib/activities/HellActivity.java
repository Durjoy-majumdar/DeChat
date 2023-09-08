package com.tencent.p014mm.hellhoundlib.activities;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import fi3.C86868b;
import g91.C20813c;
import h81.C20928j;
import i20.C21043a;
import i20.C21044b;
import i20.C21045c;
import i91.C21060a;
import i91.C21062c;
import j91.C21200b;
import j91.C21203d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k91.C117394e;
import op3.C117877b;
import r91.C22217a;
import t91.C22466j;
import t91.C64208c;
import te3.C118445n03;
import te3.fh4;
import z91.C23462b;

/* renamed from: com.tencent.mm.hellhoundlib.activities.HellActivity */
public class HellActivity extends Activity {
    private SparseArray<Object> mHellTags;

    public void finish() {
        C21043a.m23197h().mo32749b(this);
        super.finish();
    }

    public void finishActivity(int i) {
        C21043a.m23197h().mo32749b(this);
        super.finishActivity(i);
    }

    public void finishActivityFromChild(Activity activity, int i) {
        C21043a.m23197h().mo32749b(activity);
        super.finishActivityFromChild(activity, i);
    }

    public void finishAffinity() {
        C21043a.m23197h().mo32749b(this);
        super.finishAffinity();
    }

    public void finishAndRemoveTask() {
        C21043a.m23197h().mo32749b(this);
        super.finishAndRemoveTask();
    }

    public Object getHellTag(int i) {
        SparseArray<Object> sparseArray = this.mHellTags;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public boolean moveTaskToBack(boolean z) {
        C21043a h = C21043a.m23197h();
        h.getClass();
        C21045c cVar = h.f59538b;
        if (cVar != null) {
            C21203d.C21204a aVar = (C21203d.C21204a) cVar;
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, moveTaskToBack: %s, %d", getClass().getName(), Integer.valueOf(hashCode()));
            if (C21203d.this.f59975a != null && C86868b.m107886a(this)) {
                C21200b bVar = (C21200b) C21203d.this.f59975a;
                if (bVar.f59972d) {
                    bVar.f59971c.getClass();
                    C118445n03 n032 = new C118445n03();
                    n032.f354143d = new fh4();
                    n032.f354145f = System.currentTimeMillis();
                    n032.f354143d.f354001d = getClass().getCanonicalName();
                    n032.f354143d.f354002e = hashCode();
                    fh4 fh4 = n032.f354143d;
                    long j = n032.f354145f;
                    fh4.f354003f = j;
                    n032.f354144e = z;
                    C22466j.m26185b(this, j);
                    C64208c.f181939F = n032.f354143d.f354001d;
                    C20813c.m22810a().mo32508c(102, n032);
                    C23462b.m28021f().mo36917a(this, 2);
                    C22217a.m25719a(getClass().getCanonicalName(), Integer.valueOf(hashCode()), 1);
                } else {
                    C117877b<String, Integer> b = C21200b.m23662b(this);
                    if (b != null) {
                        String str = (String) b.mo182596a(0);
                        ((Integer) b.mo182596a(1)).intValue();
                        if (!TextUtils.isEmpty(str)) {
                            C117394e.m165538d(str, (String) null, 103);
                            bVar.mo33176d(str, false);
                        }
                    }
                }
                Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                while (it.hasNext()) {
                    ((C20928j.C20932d) it.next()).mo32653n(this);
                }
            }
        }
        return super.moveTaskToBack(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21043a.m23197h().mo32748a(this, 0);
    }

    public void onDestroy() {
        C21043a.m23197h().mo32748a(this, 5);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        C21045c cVar;
        super.onNewIntent(intent);
        C21043a h = C21043a.m23197h();
        h.getClass();
        if (C21044b.m23215a(this) && (cVar = h.f59538b) != null) {
            C21203d.C21204a aVar = (C21203d.C21204a) cVar;
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onNewIntent: %s, %d", getClass().getName(), Integer.valueOf(hashCode()));
            if (C21203d.this.f59975a != null && C86868b.m107886a(this)) {
                C21200b bVar = (C21200b) C21203d.this.f59975a;
                if (bVar.f59972d) {
                    C20813c.m22810a().mo32508c(201, bVar.f59971c.mo33177a(intent, this));
                } else {
                    String canonicalName = getClass().getCanonicalName();
                    int hashCode = hashCode();
                    C117394e.m165538d(canonicalName, (String) null, 104);
                    C21200b.m23663c((Activity) null, intent, (String) null, canonicalName, hashCode);
                    C21062c.m23249d().mo32777h(canonicalName, hashCode, C21060a.CREATE);
                }
                Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                while (it.hasNext()) {
                    ((C20928j.C20932d) it.next()).mo32662x(intent, this);
                }
            }
        }
    }

    public void onPause() {
        super.onPause();
        C21043a.m23197h().mo32748a(this, 3);
    }

    public void onPostResume() {
        super.onPostResume();
        C21043a.m23197h().mo32748a(this, 6);
    }

    public void onResume() {
        super.onResume();
        C21043a.m23197h().mo32748a(this, 2);
    }

    public void onStop() {
        super.onStop();
        C21043a.m23197h().mo32748a(this, 4);
    }

    public void setHellTag(int i, Object obj) {
        if (this.mHellTags == null) {
            this.mHellTags = new SparseArray<>(2);
        }
        this.mHellTags.put(i, obj);
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        C21045c cVar;
        C21043a h = C21043a.m23197h();
        h.getClass();
        if (C21044b.m23215a(this) && (cVar = h.f59538b) != null) {
            C21203d.C21204a aVar = (C21203d.C21204a) cVar;
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivities: %s, %d", getClass().getName(), Integer.valueOf(hashCode()));
            if (C21203d.this.f59975a != null && C86868b.m107886a(this) && intentArr != null && intentArr.length > 0) {
                ((C21200b) C21203d.this.f59975a).mo33175a(this, intentArr[0]);
            }
        }
        super.startActivities(intentArr, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C21043a.m23197h().mo32754g(this, intent);
        super.startActivityForResult(intent, i, bundle);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        C21043a.m23197h().mo32754g(this, intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    public boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        C21043a.m23197h().mo32754g(this, intent);
        return super.startActivityIfNeeded(intent, i, bundle);
    }
}
