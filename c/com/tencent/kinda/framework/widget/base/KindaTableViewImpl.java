package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KTableView;
import com.tencent.kinda.gen.KTableViewCellEditAction;
import com.tencent.kinda.gen.KTableViewCellManager;
import com.tencent.kinda.gen.KViewLayout;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

public class KindaTableViewImpl extends MMKView<ListView> implements KTableView {
    private static final String TAG = "MicroMsg.KindaTableViewImplV2";
    private byte _hellAccFlag_;
    private Adapter mAdapter;
    /* access modifiers changed from: private */
    public ArrayList<KTableViewCellManager> mDataList = new ArrayList<>();
    /* access modifiers changed from: private */
    public boolean mEnableRefresh = false;
    /* access modifiers changed from: private */
    public VoidCallback mLoadMoreCallback;
    /* access modifiers changed from: private */
    public VoidCallback mOnScrollBeginCallback;
    /* access modifiers changed from: private */
    public Map<Integer, WeakReference<View>> mViewMap = new HashMap();
    private View refreshFooterView;

    public class Adapter extends BaseAdapter {
        private Adapter() {
        }

        /* access modifiers changed from: private */
        public void showEditActions(int i) {
            final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
            if (topOrUIPageFragmentActivity != null) {
                final ArrayList<KTableViewCellEditAction> editActions = ((KTableViewCellManager) KindaTableViewImpl.this.mDataList.get(i)).getEditActions();
                C77407n nVar = new C77407n((Context) topOrUIPageFragmentActivity, 1, false);
                nVar.f225771i = new C11182m0() {
                    public void onCreateMMMenu(C76874e0 e0Var) {
                        Iterator it = editActions.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            KTableViewCellEditAction kTableViewCellEditAction = (KTableViewCellEditAction) it.next();
                            if (kTableViewCellEditAction.getIsDestructive()) {
                                e0Var.mo107140d(i, topOrUIPageFragmentActivity.getResources().getColor(C0966R.color.f2966ao), kTableViewCellEditAction.getTitle());
                            } else {
                                e0Var.add(0, i, 0, (CharSequence) kTableViewCellEditAction.getTitle());
                            }
                            i++;
                        }
                    }
                };
                nVar.f225782p = new C11184p0() {
                    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                        if (i < editActions.size()) {
                            ((KTableViewCellEditAction) editActions.get(i)).triggered();
                        }
                    }
                };
                nVar.mo107573q();
            }
        }

        public int getCount() {
            return KindaTableViewImpl.this.mDataList.size();
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            Log.m105927v(KindaTableViewImpl.TAG, "get view for: %s", Integer.valueOf(i));
            KViewLayout view2 = ((KTableViewCellManager) KindaTableViewImpl.this.mDataList.get(i)).getView();
            Assert.assertTrue("kViewLayout must be MMKViewLayout!", view2 instanceof MMKViewLayout);
            MMKViewLayout mMKViewLayout = (MMKViewLayout) view2;
            KindaTableViewImpl.this.mViewMap.put(Integer.valueOf(i), new WeakReference(mMKViewLayout.getView()));
            View view3 = mMKViewLayout.getView();
            view3.setTag("test_position_" + i);
            ViewGroup viewGroup2 = (ViewGroup) mMKViewLayout.getView();
            if (!((KTableViewCellManager) KindaTableViewImpl.this.mDataList.get(i)).getEditActions().isEmpty()) {
                viewGroup2.setOnLongClickListener(new View.OnLongClickListener() {
                    private byte _hellAccFlag_;

                    public boolean onLongClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/kinda/framework/widget/base/KindaTableViewImpl$Adapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                        Adapter.this.showEditActions(i);
                        C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl$Adapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        return false;
                    }
                });
            } else {
                viewGroup2.setOnLongClickListener((View.OnLongClickListener) null);
            }
            if (viewGroup2.getParent() != null) {
                ((ViewGroup) viewGroup2.getParent()).removeView(viewGroup2);
            }
            FrameLayout frameLayout = new FrameLayout(KindaTableViewImpl.this.mContext);
            frameLayout.addView(viewGroup2);
            return frameLayout;
        }

        public KTableViewCellManager getItem(int i) {
            return (KTableViewCellManager) KindaTableViewImpl.this.mDataList.get(i);
        }
    }

    public void setCells(ArrayList<KTableViewCellManager> arrayList) {
        Log.m105925i(TAG, "set cells: %s", Integer.valueOf(arrayList.size()));
        this.mDataList.clear();
        this.mViewMap.clear();
        this.mDataList.addAll(arrayList);
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void setEnableFooterRefreshView(boolean z) {
        boolean z2 = z;
        this.mEnableRefresh = z2;
        if (z2) {
            View view = this.refreshFooterView;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.refreshFooterView;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "setEnableFooterRefreshView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setFooterRefreshViewLoadMoreCallbackImpl(VoidCallback voidCallback) {
        Log.m105918d(TAG, "set footer refresh callback");
        this.mLoadMoreCallback = voidCallback;
    }

    public void setOnBeginScrollCallbackImpl(VoidCallback voidCallback) {
        this.mOnScrollBeginCallback = voidCallback;
    }

    public ListView createView(Context context) {
        Log.m105918d(TAG, "create view");
        this.view = new ListView(context);
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6266a4, (ViewGroup) null);
        this.refreshFooterView = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroid/widget/ListView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl", "createView", "(Landroid/content/Context;)Landroid/widget/ListView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((ListView) this.view).addFooterView(this.refreshFooterView, (Object) null, false);
        Adapter adapter = new Adapter();
        this.mAdapter = adapter;
        ((ListView) this.view).setAdapter(adapter);
        ((ListView) this.view).setSelector(C0966R.color.ahf);
        ((ListView) this.view).setOnScrollListener(new AbsListView.OnScrollListener() {
            private byte _hellAccFlag_;

            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                arrayList.add(Integer.valueOf(i3));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/KindaTableViewImpl$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
                if (KindaTableViewImpl.this.mEnableRefresh && absListView.getLastVisiblePosition() == absListView.getCount() - 1 && absListView.getCount() > 0 && KindaTableViewImpl.this.mLoadMoreCallback != null) {
                    KindaTableViewImpl.this.mLoadMoreCallback.call();
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/KindaTableViewImpl$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
                if (i == 1 && KindaTableViewImpl.this.mOnScrollBeginCallback != null) {
                    KindaTableViewImpl.this.mOnScrollBeginCallback.call();
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/KindaTableViewImpl$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        });
        ((ListView) this.view).setMotionEventSplittingEnabled(false);
        return (ListView) this.view;
    }
}
