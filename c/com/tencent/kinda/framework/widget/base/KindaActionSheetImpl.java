package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KActionSheet;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import java.util.ArrayList;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

public class KindaActionSheetImpl implements KActionSheet {
    /* access modifiers changed from: private */
    public List<VoidCallback> buttonCallbacks = new ArrayList();
    /* access modifiers changed from: private */
    public List<String> buttonTitles = new ArrayList();
    /* access modifiers changed from: private */
    public int mDestructiveIndex = -1;
    private C77407n sheet;
    private String title;

    public void addButtonImpl(String str, VoidCallback voidCallback) {
        this.buttonTitles.add(str);
        this.buttonCallbacks.add(voidCallback);
    }

    public void setCancelButtonTitle(String str) {
    }

    public void setDestructiveIndex(int i) {
        this.mDestructiveIndex = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void show() {
        final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity != null) {
            boolean z = this.title != null;
            this.sheet = new C77407n((Context) topOrUIPageFragmentActivity, 1, z);
            if (z) {
                View inflate = C85868k2.m106137b(topOrUIPageFragmentActivity).inflate(C0966R.C0971layout.bc5, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
                textView.setText(this.title);
                textView.setTextSize(14.0f);
                textView.setGravity(17);
                this.sheet.mo107569n(inflate, false);
            }
            this.sheet.f225771i = new C11182m0() {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    int i = 0;
                    for (String str : KindaActionSheetImpl.this.buttonTitles) {
                        if (KindaActionSheetImpl.this.mDestructiveIndex < 0 || KindaActionSheetImpl.this.mDestructiveIndex != i) {
                            e0Var.add(0, i, 0, (CharSequence) str);
                        } else {
                            e0Var.mo107140d(i, topOrUIPageFragmentActivity.getResources().getColor(C0966R.color.f2966ao), str);
                        }
                        i++;
                    }
                }
            };
            this.sheet.f225782p = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    if (i < KindaActionSheetImpl.this.buttonCallbacks.size()) {
                        ((VoidCallback) KindaActionSheetImpl.this.buttonCallbacks.get(i)).call();
                    }
                }
            };
            this.sheet.mo107573q();
        }
    }
}
