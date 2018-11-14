package com.lemanoman.javafxmaven.controller;

import com.lemanoman.javafxmaven.Starter;
import com.lemanoman.javafxmaven.interfaces.FXController;
import javafx.scene.Parent;

public class DefaultController implements FXController {
    protected Parent parent;
    protected Starter starter;

    @Override
    public void initialize(Parent parent, Starter starter) {
        this.parent = parent;
        this.starter = starter;
        onLoad();
    }

    public void onLoad() {

    }


}
