package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p1199l3.C117444a;

/* renamed from: androidx.fragment.app.s */
public class C112960s implements LayoutInflater.Factory2 {

    /* renamed from: d */
    public final FragmentManager f338163d;

    /* renamed from: androidx.fragment.app.s$a */
    public class C112961a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C112970z f338164d;

        public C112961a(C112970z zVar) {
            this.f338164d = zVar;
        }

        public void onViewAttachedToWindow(View view) {
            C112970z zVar = this.f338164d;
            Fragment fragment = zVar.f338187c;
            zVar.mo165284k();
            C112950q0.m154551f((ViewGroup) fragment.mView.getParent(), C112960s.this.f338163d).mo165235e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C112960s(FragmentManager fragmentManager) {
        this.f338163d = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C112970z zVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f338163d);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C117444a.f351509a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = Fragment.class.isAssignableFrom(C112949q.m154548b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    fragment = this.f338163d.findFragmentById(resourceId);
                }
                if (fragment == null && string != null) {
                    fragment = this.f338163d.findFragmentByTag(string);
                }
                if (fragment == null && i != -1) {
                    fragment = this.f338163d.findFragmentById(i);
                }
                if (fragment == null) {
                    fragment = this.f338163d.getFragmentFactory().mo165135a(context.getClassLoader(), attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : i;
                    fragment.mContainerId = i;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager = this.f338163d;
                    fragment.mFragmentManager = fragmentManager;
                    fragment.mHost = fragmentManager.getHost();
                    fragment.onInflate(this.f338163d.getHost().f338160e, attributeSet, fragment.mSavedFragmentState);
                    zVar = this.f338163d.addFragment(fragment);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!fragment.mInLayout) {
                    fragment.mInLayout = true;
                    FragmentManager fragmentManager2 = this.f338163d;
                    fragment.mFragmentManager = fragmentManager2;
                    fragment.mHost = fragmentManager2.getHost();
                    fragment.onInflate(this.f338163d.getHost().f338160e, attributeSet, fragment.mSavedFragmentState);
                    zVar = this.f338163d.createOrGetFragmentStateManager(fragment);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        fragment.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                fragment.mContainer = (ViewGroup) view;
                zVar.mo165284k();
                zVar.mo165283j();
                View view2 = fragment.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new C112961a(zVar));
                    return fragment.mView;
                }
                throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
        }
        return null;
    }
}
