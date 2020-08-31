import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './Components/main/main.component';
import { HeaderComponent } from './Components/header/header.component';
import { SigninComponent } from './Components/signin/signin.component';
import { SignUpComponent } from './Components/sign-up/sign-up.component';
import { WeatherAppComponent } from './Components/weather-app/weather-app.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    HeaderComponent,
    SigninComponent,
    SignUpComponent,
    WeatherAppComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }