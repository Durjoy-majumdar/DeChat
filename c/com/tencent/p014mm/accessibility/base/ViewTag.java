package com.tencent.p014mm.accessibility.base;

import android.view.TouchDelegate;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/base/ViewTag;", "", "()V", "disableFocusFlag", "", "getDisableFocusFlag", "()Ljava/lang/Boolean;", "setDisableFocusFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "eBottom", "", "getEBottom", "()Ljava/lang/Integer;", "setEBottom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "eLeft", "getELeft", "setELeft", "eRight", "getERight", "setERight", "eTop", "getETop", "setETop", "havenExpand", "getHavenExpand", "setHavenExpand", "havenInflate", "getHavenInflate", "setHavenInflate", "touchDelegate", "Ljava/lang/ref/WeakReference;", "Landroid/view/TouchDelegate;", "getTouchDelegate", "()Ljava/lang/ref/WeakReference;", "setTouchDelegate", "(Ljava/lang/ref/WeakReference;)V", "touchDelegateParent", "Landroid/view/ViewGroup;", "getTouchDelegateParent", "setTouchDelegateParent", "viewType", "", "getViewType", "()Ljava/lang/CharSequence;", "setViewType", "(Ljava/lang/CharSequence;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.base.ViewTag */
public final class ViewTag {
    public static final int $stable = 8;
    private Boolean disableFocusFlag;
    private Integer eBottom;
    private Integer eLeft;
    private Integer eRight;
    private Integer eTop;
    private Boolean havenExpand;
    private Boolean havenInflate;
    private WeakReference<TouchDelegate> touchDelegate;
    private WeakReference<ViewGroup> touchDelegateParent;
    private CharSequence viewType;

    public final Boolean getDisableFocusFlag() {
        return this.disableFocusFlag;
    }

    public final Integer getEBottom() {
        return this.eBottom;
    }

    public final Integer getELeft() {
        return this.eLeft;
    }

    public final Integer getERight() {
        return this.eRight;
    }

    public final Integer getETop() {
        return this.eTop;
    }

    public final Boolean getHavenExpand() {
        return this.havenExpand;
    }

    public final Boolean getHavenInflate() {
        return this.havenInflate;
    }

    public final WeakReference<TouchDelegate> getTouchDelegate() {
        return this.touchDelegate;
    }

    public final WeakReference<ViewGroup> getTouchDelegateParent() {
        return this.touchDelegateParent;
    }

    public final CharSequence getViewType() {
        return this.viewType;
    }

    public final void setDisableFocusFlag(Boolean bool) {
        this.disableFocusFlag = bool;
    }

    public final void setEBottom(Integer num) {
        this.eBottom = num;
    }

    public final void setELeft(Integer num) {
        this.eLeft = num;
    }

    public final void setERight(Integer num) {
        this.eRight = num;
    }

    public final void setETop(Integer num) {
        this.eTop = num;
    }

    public final void setHavenExpand(Boolean bool) {
        this.havenExpand = bool;
    }

    public final void setHavenInflate(Boolean bool) {
        this.havenInflate = bool;
    }

    public final void setTouchDelegate(WeakReference<TouchDelegate> weakReference) {
        this.touchDelegate = weakReference;
    }

    public final void setTouchDelegateParent(WeakReference<ViewGroup> weakReference) {
        this.touchDelegateParent = weakReference;
    }

    public final void setViewType(CharSequence charSequence) {
        this.viewType = charSequence;
    }
}
