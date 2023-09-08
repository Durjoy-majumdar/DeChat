package com.tencent.matrix.lifecycle;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/matrix/lifecycle/StatefulOwnerKt$shadow$1", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class StatefulOwnerKt$shadow$1 extends StatefulOwner {
    public final /* synthetic */ boolean $serial;
    public final /* synthetic */ IStatefulOwner $this_shadow;

    /* renamed from: com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1$a */
    public static final class C80391a implements C80407h, C80406g {

        /* renamed from: d */
        public final /* synthetic */ StatefulOwnerKt$shadow$1 f235320d;

        public C80391a(StatefulOwnerKt$shadow$1 statefulOwnerKt$shadow$1) {
            this.f235320d = statefulOwnerKt$shadow$1;
        }

        public void off() {
            this.f235320d.turnOff();
        }

        /* renamed from: on */
        public void mo60742on() {
            this.f235320d.turnOn();
        }

        public boolean serial() {
            return this.f235320d.$serial;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatefulOwnerKt$shadow$1(IStatefulOwner iStatefulOwner, boolean z, boolean z2) {
        super(z2);
        this.$this_shadow = iStatefulOwner;
        this.$serial = z;
        iStatefulOwner.observeForever(new C80391a(this));
    }
}
