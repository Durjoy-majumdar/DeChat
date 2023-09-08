package androidx.camera.core;

import java.util.ArrayList;
import java.util.List;
import p329d3.C20434g;

public final class UseCaseGroup {
    private final List<UseCase> mUseCases;
    private final ViewPort mViewPort;

    public static final class Builder {
        private final List<UseCase> mUseCases = new ArrayList();
        private ViewPort mViewPort;

        public Builder addUseCase(UseCase useCase) {
            this.mUseCases.add(useCase);
            return this;
        }

        public UseCaseGroup build() {
            C20434g.m22018b(!this.mUseCases.isEmpty(), "UseCase must not be empty.");
            return new UseCaseGroup(this.mViewPort, this.mUseCases);
        }

        public Builder setViewPort(ViewPort viewPort) {
            this.mViewPort = viewPort;
            return this;
        }
    }

    public UseCaseGroup(ViewPort viewPort, List<UseCase> list) {
        this.mViewPort = viewPort;
        this.mUseCases = list;
    }

    public List<UseCase> getUseCases() {
        return this.mUseCases;
    }

    public ViewPort getViewPort() {
        return this.mViewPort;
    }
}
