package com.tencent.p014mm.p136ui;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.FragmentActivitySupport */
public abstract class FragmentActivitySupport extends HellAndroidXFragment {
    private byte _hellAccFlag_;
    public Intent fragmentIntent;
    public boolean hasDestory;
    public boolean isCurrentActivity;
    private FragmentActivity mActivity;

    public FragmentActivitySupport(boolean z) {
        this.hasDestory = false;
        this.fragmentIntent = new Intent();
        this.isCurrentActivity = z;
    }

    public View findViewById(int i) {
        View view = getView();
        View findViewById = view != null ? view.findViewById(i) : null;
        return findViewById != null ? findViewById : thisActivity().findViewById(i);
    }

    public void finish() {
        if (this.isCurrentActivity) {
            if (thisActivity() != null) {
                thisActivity().finish();
            }
        } else if (thisActivity() != null) {
            thisActivity().getSupportFragmentManager().popBackStack();
        }
    }

    public LayoutInflater getActivityLayoutInflater() {
        return thisActivity().getLayoutInflater();
    }

    public Boolean getBooleanExtra(String str, boolean z) {
        return (!this.isCurrentActivity || getArguments() != null) ? Boolean.valueOf(getArguments().getBoolean(str, z)) : Boolean.valueOf(thisActivity().getIntent().getBooleanExtra(str, z));
    }

    public byte[] getByteArrayExtra(String str) {
        byte[] byteArrayExtra = (!this.isCurrentActivity || thisActivity() == null) ? null : thisActivity().getIntent().getByteArrayExtra(str);
        return (byteArrayExtra != null || getArguments() == null) ? byteArrayExtra : super.getArguments().getByteArray(str);
    }

    public ContentResolver getContentResolver() {
        if (thisActivity() != null) {
            return thisActivity().getContentResolver();
        }
        return null;
    }

    public int getIntExtra(String str, int i) {
        return (!this.isCurrentActivity || getArguments() != null || thisActivity() == null) ? getArguments() != null ? getArguments().getInt(str, i) : i : thisActivity().getIntent().getIntExtra(str, i);
    }

    public Intent getIntent() {
        return (!this.isCurrentActivity || getArguments() != null || thisActivity() == null) ? this.fragmentIntent : thisActivity().getIntent();
    }

    public long getLongExtra(String str, long j) {
        return (!this.isCurrentActivity || getArguments() != null) ? getArguments() != null ? getArguments().getLong(str, j) : j : thisActivity().getIntent().getLongExtra(str, j);
    }

    public String getPackageName() {
        return thisActivity().getPackageName();
    }

    public <T extends Parcelable> T getParcelableExtra(String str) {
        T parcelableExtra = (!this.isCurrentActivity || thisActivity() == null) ? null : thisActivity().getIntent().getParcelableExtra(str);
        return (parcelableExtra != null || getArguments() == null) ? parcelableExtra : super.getArguments().getParcelable(str);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return thisActivity().getSharedPreferences(str, i);
    }

    public String[] getStringArrayExtra(String str) {
        return (!this.isCurrentActivity || getArguments() != null) ? getArguments().getStringArray(str) : thisActivity().getIntent().getStringArrayExtra(str);
    }

    public ArrayList<String> getStringArrayList(String str) {
        return (!this.isCurrentActivity || getArguments() != null) ? getArguments().getStringArrayList(str) : thisActivity().getIntent().getStringArrayListExtra(str);
    }

    public String getStringExtra(String str) {
        String stringExtra = (!this.isCurrentActivity || thisActivity() == null) ? null : thisActivity().getIntent().getStringExtra(str);
        return (stringExtra != null || getArguments() == null) ? stringExtra : super.getArguments().getString(str);
    }

    public Window getWindow() {
        if (thisActivity() != null) {
            return thisActivity().getWindow();
        }
        return null;
    }

    public WindowManager getWindowManager() {
        if (thisActivity() != null) {
            return thisActivity().getWindowManager();
        }
        return null;
    }

    public boolean isFinishing() {
        if (thisActivity() == null) {
            return true;
        }
        return thisActivity().isFinishing();
    }

    public boolean isShowing() {
        return !this.hasDestory;
    }

    public final Cursor managedQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (thisActivity() != null) {
            return thisActivity().managedQuery(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mActivity = getActivity();
    }

    public void onDestroy() {
        super.onDestroy();
        this.hasDestory = true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            finish();
            return true;
        } else if (i == 82 && keyEvent.getAction() == 1) {
            return onKeyUp(i, keyEvent);
        } else {
            return false;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public void openContextMenu(View view) {
        if (thisActivity() != null) {
            thisActivity().openContextMenu(view);
        }
    }

    public void overridePendingTransition(int i, int i2) {
        if (thisActivity() != null) {
            thisActivity().overridePendingTransition(i, i2);
        }
    }

    public void sendBroadcast(Intent intent) {
        thisActivity().sendBroadcast(intent);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        this.fragmentIntent.putExtras(bundle);
    }

    public void setRequestedOrientation(int i) {
        if (thisActivity() != null) {
            thisActivity().setRequestedOrientation(i);
        }
    }

    public void setResult(int i) {
        if (this.isCurrentActivity) {
            thisActivity().setResult(i);
        }
    }

    public void startActivity(Intent intent) {
        FragmentActivity thisActivity = thisActivity();
        if (thisActivity == null) {
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        thisActivity.startActivityFromFragment(this, intent, -1);
    }

    public void startFragment(Class<?> cls, Intent intent) {
        if (this.isCurrentActivity) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public FragmentActivity thisActivity() {
        if (this.mActivity == null) {
            this.mActivity = getActivity();
        }
        return this.mActivity;
    }

    public void setResult(int i, Intent intent) {
        if (this.isCurrentActivity) {
            thisActivity().setResult(i);
        } else {
            thisActivity().setResult(i, intent);
        }
    }

    public FragmentActivitySupport() {
        this.hasDestory = false;
        this.fragmentIntent = new Intent();
        this.isCurrentActivity = false;
    }
}
