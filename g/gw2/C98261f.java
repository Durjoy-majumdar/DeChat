package gw2;

import ew2.C97757a;
import java.util.LinkedList;

/* renamed from: gw2.f */
public final class C98261f {

    /* renamed from: a */
    public String f288068a = "";

    /* renamed from: b */
    public long f288069b;

    /* renamed from: c */
    public int f288070c;

    /* renamed from: d */
    public boolean f288071d;

    /* renamed from: e */
    public boolean f288072e;

    /* renamed from: f */
    public boolean f288073f;

    /* renamed from: g */
    public final LinkedList<C97757a> f288074g = new LinkedList<>();

    /* renamed from: h */
    public final LinkedList<C97757a> f288075h = new LinkedList<>();

    /* renamed from: i */
    public final LinkedList<C97757a> f288076i = new LinkedList<>();

    /* renamed from: j */
    public final LinkedList<C97757a> f288077j = new LinkedList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C98261f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C98261f fVar = (C98261f) obj;
        return this.f288069b == fVar.f288069b && this.f288074g.size() == fVar.f288074g.size() && this.f288072e == fVar.f288072e && this.f288071d == fVar.f288071d;
    }

    public String toString() {
        return "StoryGalleryComment(fromUser='" + this.f288068a + "', storyId=" + this.f288069b + ", commentType=" + this.f288070c + ", commentUser=" + null + ", isUnread=" + this.f288072e + ", commentList=" + this.f288074g + ')';
    }
}
