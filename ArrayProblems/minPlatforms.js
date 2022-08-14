let arrivals = [0900, 0940, 0950, 1100, 1500, 1800];
let departures = [0910, 1200, 1120, 1130, 1900, 2000];
let no_of_stations = 0;


for (let i = 0; i < departures.length; i++) {
  if (arrivals[i + 1] < departures[i]) {
    no_of_stations += 1;
  }
}

if (no_of_stations == 0) no_of_stations = 1;
console.log(no_of_stations);
