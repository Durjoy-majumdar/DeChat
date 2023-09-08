package h81;

import di3.C7335d;

/* renamed from: h81.k */
public interface C8496k extends C7335d {

    /* renamed from: h81.k$a */
    public enum C8497a {
        MM_DEFAULT(0),
        MMAppMgr_Activated(1),
        MMAppMgr_Deactivated(2),
        MMLifeCall_OnResume(3),
        MMLifeCall_OnPause(4),
        MMActivity_OnResume(5),
        MMActivity_OnPause(6),
        MMActivity_Back2Front(7),
        MMActivity_Front2Back(8);
        

        /* renamed from: d */
        public int f27521d;

        /* access modifiers changed from: public */
        C8497a(int i) {
            this.f27521d = i;
        }

        /* renamed from: a */
        public static C8497a m8414a(int i) {
            switch (i) {
                case 1:
                    return MMAppMgr_Activated;
                case 2:
                    return MMAppMgr_Deactivated;
                case 3:
                    return MMLifeCall_OnResume;
                case 4:
                    return MMLifeCall_OnPause;
                case 5:
                    return MMActivity_OnResume;
                case 6:
                    return MMActivity_OnPause;
                case 7:
                    return MMActivity_Back2Front;
                case 8:
                    return MMActivity_Front2Back;
                default:
                    return MM_DEFAULT;
            }
        }
    }

    /* renamed from: s1 */
    void mo9419s1();
}
