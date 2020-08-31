import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MainComponent} from './Components/main/main.component';
import { WeatherAppComponent } from './Components/weather-app/weather-app.component'; 

const routes: Routes = [
  {path:'',component: MainComponent },
  {path:'app',component: WeatherAppComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }